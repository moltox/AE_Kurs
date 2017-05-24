package NuetzlicheKlassenUndPackages.uebung_18_10.uebung_1;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Exercise2 {
	int month;
	int year;
	LocalDate date;
	DateFormatSymbols symbols;
	String monthNames[];
	final String dayNamesShort[] = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };

	public Exercise2() {
		this(LocalDate.now().getMonth().getValue(), LocalDate.now().getYear());
	}

	public Exercise2(int month, int year) {
		this.month = month;
		this.year = year;
		date = LocalDate.of(year, month, 1);
		symbols = new DateFormatSymbols(Locale.getDefault());
		monthNames = symbols.getMonths();
	};

	public String getMonthName(int... month) {
		int m = (month.length == 0) ? this.month : month[0];
		return monthNames[m - 1];
	}

	public String getDayName(int day) {
		return dayNamesShort[day];
	}

	public void display() {
		System.out.println("Kalendar für " + getMonthName() + " " + year);
		System.out.print("Wo\t");
		for (int c = 0; c < dayNamesShort.length; c++) {
			System.out.print(getDayName(c) + "\t");
		}
		WeekFields week = WeekFields.of(Locale.getDefault());
		int iterator = 0, monthLen = date.lengthOfMonth();

		do {
			if (iterator == 0 || date.getDayOfWeek() == DayOfWeek.MONDAY) {
				System.out.print("\r\n" + date.get(week.weekOfYear()) + "\t");
				if (iterator == 0) {
					for (int c = 1; c < date.getDayOfWeek().getValue(); c++) {
						System.out.print("\t");
					}
				}

			}
			System.out.print(date.getDayOfMonth() + "\t");
			date = date.plusDays(1);

		} while (++iterator < monthLen);
	}

	public static void main(String[] args) {
		Exercise2 calendar = null;
		switch (args.length) {
		case 2:
			int month = -1;
			int year = -1;
			try {
				month = Integer.parseInt(args[0]);
				year = Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				System.out.println("Argumente falsch. Nur Zahlen erlaubt!");
				System.exit(1);
			}
			if (month > 12 || month < 1) {
				System.out.println("Argument 1 muss zwischen 1 und 12 sein !");
				System.exit(1);
			} else {
				calendar = new Exercise2(month, year);
			}
			break;
		default:
			calendar = new Exercise2();
		}

		calendar.display();
	}
}

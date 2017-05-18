package dbaccess;

import java.util.Date;

public class DatePrinter implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(new Date());
			SleepUtils.safeSleep(5000);
		}
	}
}

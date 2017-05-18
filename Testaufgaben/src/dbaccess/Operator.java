package dbaccess;

import java.util.*;

public class Operator {
	public static void main(final String[] args)
	{
		final Integer[] sampleValues = {1,3,5,7,11,13,17,19};
		final Integer[] noValues = {};

		final Comparator<Integer> naturalOrder = Comparator.naturalOrder();
		final Optional<Integer> max = Arrays.stream(sampleValues).max(naturalOrder);
		final Optional<Integer> min = Arrays.stream(noValues).min(naturalOrder);

		System.out.println("max:        " + max);
		System.out.println("min:        " + min);

		System.out.println("isPresent?: " + min.isPresent());

		final Integer maxValue = max.get();
		System.out.println("maxValue:   " + maxValue);

		final Optional<Integer> optionalFromValue = Optional.of(4711);
		final Optional<Double> optionalFromNull = Optional.ofNullable(null);
		System.out.println("from Value: " + optionalFromValue);
		System.out.println("from null:  " + optionalFromNull);
	}
}

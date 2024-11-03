package fi_types;

import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String[] args) {
		// Supplier -- no input, only output

		Supplier<Double> getRandomDouble = () -> Math.random();
		System.out.println(getRandomDouble.get()); // no input

	}

}

package fi_types;

import java.util.function.Function;

public class FunctionClass {

	public static void main(String[] args) {
		// Function -- both input & output
		Function<Integer, String> getInt = t -> t * 10 + " data multiplied by 10";
		System.out.println(getInt.apply(2));

	}

}

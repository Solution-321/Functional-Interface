package fi_types;

import java.util.function.Predicate;

public class PredicateClass {

	public static void main(String[] args) {
		// Predicate - boolean result
		
		Predicate<String> checkLength = str -> str.length() > 5;
		System.out.println(checkLength.test("Hello Predicate"));

	}

}

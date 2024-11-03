package fi_types;

import java.util.function.Consumer;

public class ConsumerClass {

	public static void main(String[] args) {
		// Consumer -- modifies data, no output
		
		Person p = new Person();
		Consumer<Person> setName = t -> t.setName("Hello Consumer");
		setName.accept(p);
		System.out.println(p.getName());
	}

}

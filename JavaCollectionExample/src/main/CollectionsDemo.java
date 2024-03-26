package main;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsDemo {
	final static List<Person> DATA = Util.readData("TestData.txt");

	public static void main(String[] args) {
		//Print all names
		DATA.stream().map(e -> e.getName()).collect(Collectors.toList()).forEach(e ->print(e));
		
		//Print all name in one string
		String names = DATA.stream().map(p -> p.getName()).collect(Collectors.joining(", "));
		print(names);
		
		//Print all people grouped by their departement
		DATA.stream().collect(Collectors.groupingBy(p -> p.getDepartement())).forEach((e,v) -> print(e, v));
		
		//Group people by their gender
		DATA.stream().collect(Collectors.groupingBy(p -> p.getGender())).forEach((e, v) -> print(e, v));
		
		//Number of people in each gender
		DATA.stream().collect(Collectors.groupingBy(Person::getGender, Collectors.counting())).forEach((e,v) -> print(e, v));
		
		//Total sum of salaries
		double total = DATA.stream().collect(Collectors.summingDouble(Person::getSalary));
		print(total);
		
		//Number of people in each departement
		DATA.stream().collect(Collectors.groupingBy(Person::getDepartement, Collectors.counting()))
				.forEach((e, v) -> print(e, v));
		
		//Sum of salary in each departement.
		DATA.stream()
				.collect(Collectors.groupingBy(Person::getDepartement, Collectors.summingDouble(Person::getSalary)))
				.forEach((e, v) -> {
					print(e);
					print(v);
				});

	}

	private static <T> void print(T e) {
	    System.out.println(e);
	}

	private static <T> void print(T e, Long v) {
	    print(e);
	    print(v);
	}

	private static <T> void print(T e, List<Person> v) {
	    print(e);
	    print(v);
	}

	private static void print(List<Person> persons) {
	    for (Person p : persons) {
	        print(p);
	    }
	}

}

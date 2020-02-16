package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcercisewithJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Bob", 24), new Person("Andy", "Berg", 20),
				new Person("Anderson", "Collin", 35), new Person("Carl", "James", 13), new Person("Moti", "Cab", 10),
				new Person("Ola", "Cab", 2));

		// sort person based on last name
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		System.out.println("printing all person with sorted last name" + "\n");
		printallperson(people);

		System.out.println("\n" + "printing all person with sorted last name with C" + "\n");
		printingpersonStartlastnamewithc(people);

	}

	private static void printingpersonStartlastnamewithc(List<Person> people) {
		
		people.forEach(e->{
			if(e.getLastName().startsWith("C")) {
				System.out.println(e);
			}
	
		});
	}

	private static void printallperson(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}

}

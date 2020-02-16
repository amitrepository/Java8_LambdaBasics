package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcerciseWithJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Bob", 24), new Person("Andy", "Berg", 20),
				new Person("Anderson", "Collin", 35), new Person("James", "Carl", 13), new Person("Moti", "Cab", 10),
				new Person("Ola", "Cab", 2));

			//sort person based on last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		System.out.println("printing all person with sorted last name" + "\n");
		printallperson(people);

		System.out.println("\n"+"printing all person with sorted last name with C" + "\n");
		printingpersonStartlastnamewithc(people);

	}

	private static void printingpersonStartlastnamewithc(List<Person> people) {
		for (Person p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}

	private static void printallperson(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}

}

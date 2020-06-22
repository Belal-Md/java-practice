package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class _Stream {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> people = List.of(
				new Person("Rick",Gender.Male),
				new Person("Morty",Gender.Male),
				new Person("Summer",Gender.Female),
				new Person("Beth",Gender.Female),
				new Person("Tammy",Gender.Female),
				new Person("Jasica",Gender.Female)
				//new Person("David",Gender.Prefer_not_to_say)
				);
		// Stream map
		// print set of gender
		people.stream()
		.map(person -> person.gender)
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		//display name
		System.out.println("Name of each Person");
		people.stream()
		.map(person -> person.name)
		.forEach(System.out::println);
		
		System.out.println("length of each Person lenght");
		people.stream()
		.map(person -> person.name)
		.mapToInt(String::length) //method reference
		.forEach(System.out::println);
		
		//allmatch
		Predicate <Person> personPred = person-> Gender.Female.equals(person.gender);
		Predicate <Person> personPred2 = person-> Gender.Prefer_not_to_say.equals(person.gender);
		boolean check = people.stream().allMatch(personPred);
		System.out.println(check);
		
		// anymatch
		boolean check2 = people.stream().anyMatch(personPred);
		System.out.println(check2);
		
		//noneMatch
		people.stream().anyMatch(personPred);
		System.out.println(people.stream().noneMatch(personPred2));
		
		
		
	
						
		
		

	}
	static class Person{
		private final String name;
		private final Gender gender;
		
		Person(String name, Gender gender){
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		
	}
	// create enum type data
	enum Gender{
		Male, Female, Prefer_not_to_say;
	}

}

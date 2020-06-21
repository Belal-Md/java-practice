import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> people = List.of(
				new Person("Rick",Gender.Male),
				new Person("Morty",Gender.Male),
				new Person("Summer",Gender.Female),
				new Person("Beth",Gender.Female),
				new Person("Tammy",Gender.Female),
				new Person("Jasica",Gender.Female)
				);
		// imperative approach
		System.out.println("Imperative approach");
		List<Person> females = new ArrayList<>();
		
		for(Person p : people) {
			if (Gender.Female.equals(p.gender)) {
				females.add(p);	
			}
		}
		
		for(Person p : females) {
			System.out.println(p);
		}
		
		//Declarative approach( using stream api)
		//stream abstract mode
		//Assing
		System.out.println("\nDeclarative Approach");
		// not store in seperate list
		/*people.stream()
		.filter(p -> Gender.Female.equals(p.gender))
		.collect(Collectors.toList())
		.forEach(System.out::println);*/
		
		List<Person> females2 = people.stream()
				.filter( p-> Gender.Female.equals(p.gender))
				.collect(Collectors.toList());
		females2.forEach(System.out::println);
						
		
		

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
		Male, Female
	}
	

}

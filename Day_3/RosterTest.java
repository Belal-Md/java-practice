import java.util.ArrayList;
import java.util.List;

// person class
class Person{
	private int age;
	private String name;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void PrintPerson() {
		System.out.println(this.name);
	}
}

public class RosterTest {
	interface checkperson {
		boolean test(Person p);
	}
	
	// normal method
	public static void search(List<Person> roster, int age) {
		for (Person p : roster) {
			if(p.getAge() <= age)
				p.PrintPerson();
		}	
	}
	
	public static void printPerson(List<Person> roster, checkperson tester) {
		
		for (Person p : roster) {
			if (tester.test(p))
				p.PrintPerson();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> l1 = new ArrayList<Person>();
		l1.add(new Person("Belal", 27));
		l1.add(new Person("Minhaj", 25));
		l1.add(new Person("Rick", 60));
		l1.add(new Person("morty", 14));
		// normal method
		search(l1, 25);
		
		// using local class
		class searchItem implements checkperson{

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getAge() <=25;
			}
			
		}
		
		printPerson(l1, new searchItem());
		//using anonymous class
		printPerson(l1, new checkperson(){

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getAge() <=25;
			}
			
		});
		
		// using lambda expression
		printPerson(l1, (Person p) -> p.getAge() <=25);
		

	}

}

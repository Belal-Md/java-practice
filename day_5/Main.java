package stream;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Rick", null);
		//throw null pointer exception
		//System.out.println(p.getEmail().toLowerCase());
		
		//email may nullable:
		Optional <String> email = Optional.ofNullable(p.getEmail());
		String getMail = email
				.map(String::toLowerCase)
				.orElse("Email is not provided");
		System.out.println(getMail);
		
		// alternative approcah
		if (email.isPresent()) {
			System.out.println(email.get().toLowerCase());
		}
		else
			System.out.println("email not provided");

	}

}

class Person{
	private final String name;
	private final String email;// a person may have email
	
	Person(String name, String email){
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}
    
	public String getEmail() {
		return email;
	}
	
	
}

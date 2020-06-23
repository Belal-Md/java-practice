package stream;

import java.util.Optional;

public class _Optional {
	
	public static void main(String[] args) {
		//Null pointer Exception
		/*String  x = null;
		System.out.println(x.toLowerCase());*/
		
		//Optional allows eliminate NullpointerException
		Optional <Object> empty = Optional.empty();
		//print empty
		System.out.println(empty);
		System.out.println(empty.isPresent());
		System.out.println(empty.isEmpty());
		
		
		//if empty then assing
		String word = (String) empty.orElse("Hello world!");
		System.out.println(word);
		
		System.out.println("example 2");
		//Option.of does not conatin null. throw error if we pass null
		//Optional <Object> hello = Optional.of("hello wordl");
		// if you dont know whehter the value is null or not then use ofNullable. it can take null or value as  parameter
		Optional <String> hello = Optional.ofNullable("hello");
		//print empty
		System.out.println(hello);
		System.out.println(hello.isPresent());
		System.out.println(hello.isEmpty());
		
		
		/*String orElse = hello
				.map(String::toUpperCase)
				.orElse("Enter value");
		System.out.println(orElse);*/
		
		/*String orElse = hello
		.map(String::toUpperCase)
		.orElseGet(() -> {
			// do some extra computation
			return "world";
		});
		System.out.println(orElse);*/
		
		/*String orElse = hello
				.map(String::toUpperCase)
				.orElseGet(() -> {
					// do some extra computation
					return "world";
				});
				System.out.println(orElse);*/
		
		//if value is null it throws illegal Exception 
		String orElse = hello
				.map(String::toUpperCase)
				.orElseThrow(IllegalStateException::new);
		System.out.println(orElse);
		
		hello.ifPresent(w->{
			System.out.println(w);
		});
		
		Optional <String> opm = Optional.ofNullable("Saitama");
		opm.ifPresent(System.out::println);
		
		Optional <String> opm2 = Optional.ofNullable(null);
		opm2.ifPresentOrElse(System.out::println,
		()-> System.out.println("Mumen Rider"));
		
			
		
		
		
		
	}
	
	

}

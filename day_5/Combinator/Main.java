package combinator;

import java.time.LocalDate;
import static combinator.validator.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(
				"Rick",
				"rick@gmail.com",
				"01111112",
				LocalDate.of(2001,1,1));
		//anonymous object
		System.out.println(new CustomerValidatorService()
				.isValid(customer));
		//combinator pattern
		//a design pattern that allows you to changes funciotn togather
		//basically a combinator is a function that might take all the function as
		//arguments and returns new function
		
		//using Combinator pattern
		
		Result result =emailValid().and(phoneValid()).and(isAdult()).apply(customer);
		
		System.out.println(result);
		
		
		

	}

}

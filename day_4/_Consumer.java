package Functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Consumer:Represents an operation that accepts a single input arguments and return no results
		//Conlsumet<T>
		
		Customer rick = new Customer("Rick", "1234");
		
		greet.accept(rick);
		//normal void mehtod
		greet(rick);
		
		//BiConsumer take two input arguments and return no result. 
		//BiConsumer
		greet2.accept(rick,true);
		
		//normal method 
		greet2(rick, false);
		
		
	}
	
	// normal mehtod
	static void greet(Customer c) {
		System.out.println("FP: Hello " + c.name + "! your phone no is "+ c.phone);
	}
	
	//Functional approach
	static Consumer <Customer> greet = c ->
	System.out.println("IP: Hello " + c.name + "! your phone no is "+ c.phone);
	
	// use BiConsumer
	static BiConsumer <Customer, Boolean> greet2 = (c, show) ->
	System.out.println("IP: Hello " + c.name + "! your phone no is "+ (show ? c.phone: "****"));
	
	//normal method
	static void greet2(Customer c, boolean show) {
		System.out.println("IP: Hello " + c.name + "! your phone no is "+ (show ? c.phone: "****"));
		
	}
	
	static class Customer{
		private final String name;
		private final String phone;
		
		Customer(String name, String phone)
		{
			this.name = name;
			this.phone = phone;
		}
		
	}

}

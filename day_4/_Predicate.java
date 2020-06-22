package Functional;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Non functonal way");
		System.out.println(isValid("01811223344"));
		System.out.println(isValid("00112233445"));
		System.out.println(isValid("018"));
		
		System.out.println("Functonal way");
		System.out.println(isValid.test("01811223344"));
		System.out.println(isValid.test("00112233445"));
		System.out.println(isValid.test("018"));
		
		//combine two predicate
		System.out.println("combine two predicate");
		System.out.println(isValid.and(contain).test("01811223344"));
		System.out.println(isValid.and(contain).test("01811220044"));
		System.out.println(isValid.or(contain).test("01811220044"));
		

	}
	
	//Predicate: Boolean value function with one arguments
	static Predicate <String> isValid = phone -> phone.startsWith("01") && phone.length() == 11;
	
	//Bipredicate: take two arguments Simlar to BiFunction and BiConsumer
	
	static Predicate <String> contain = phone -> phone.contains("3");
	
	static boolean isValid(String phone) {
		return phone.startsWith("01") && phone.length() == 11;
	}

}

package Functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Built_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int increment = increment(1);
		System.out.println(increment);
		
		//functional 1 (FP) take only one input and produce one output
		int increment2 = incrementByOne.apply(1);
		System.out.println(increment2);
		
		//function 2 (FP)
		int multiply = multiplyBy10.apply(increment2);
		System.out.println(multiply);
		
		//Combine two function
		Function<Integer, Integer> addMul = incrementByOne.andThen(multiplyBy10);
		System.out.println(addMul.apply(3));
		
		//Bi-funciton: take two input and procduce one output. FP
		System.out.println("BiFuncion :" + addThenMul.apply(3,100));
		
		//normal function
		System.out.println("Normal funciton: " + addThenMul(3,100));
		
		
		
	}
	//functional style
	static Function<Integer, Integer> incrementByOne = number -> number + 1;
	
	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
	
	// imperative style
	static int increment(int number) {
		return number + 1;
	}
	
	//imparative syte two input and one output funciotn
	static int addThenMul(int number, int mult) {
		return (number +1) * mult;
	}
	
	//Functional approach: 2 in, 1 out
	static BiFunction<Integer, Integer, Integer> addThenMul = (number, mul)-> (number+1)*mul;
		
		

}
	

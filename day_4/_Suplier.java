package Functional;

import java.util.List;
import java.util.function.Supplier;

public class _Suplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getConnectionUrl());
		
		//Functional approach
		System.out.println(getUrl.get());
		
		System.out.println(listUrl.get());
		

	}
	//supplier: represents a supplier of results. Supplier<T>
	
	static Supplier <String> getUrl = () -> "jdbc://localhost:1234/users";
	
	// Supplier can return any kind of value. for instances:
	
	static Supplier <List<String>> listUrl = () -> List.of("jdbc://localhost:1234/users",
			"jdbc://localhost:1234/customer");
	
	// the purpose of this function return a value
	static String getConnectionUrl() {
		return "jdbc://localhost:1234/users";
	}
	

}

package ie.tudublin.sqa;

import java.util.ArrayList;

public class Examples {
	
	ArrayList<Integer>numbers = new ArrayList<>();

	public Examples() {
		// TODO Auto-generated constructor stub
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
	}
	
	public String searchNumbers(int num) {
		if(numbers.contains(num)) {
			System.out.println("FOUND");
			
			return "FOUND";
		}
		else if(!numbers.contains(num))
		{
			System.out.println("NOT FOUND");
			return "NOT FOUND";
		}
		else 
			return "NULL";
		
	}

}

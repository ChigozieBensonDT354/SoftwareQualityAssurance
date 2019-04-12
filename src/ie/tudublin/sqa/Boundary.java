package ie.tudublin.sqa;

import java.util.ArrayList;
/**
 * 
 * @author I342031
 *This class takes in an array and checks whether its length is inside or outside the boundaries
 */

public class Boundary {

	public Boundary() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int addNumbers(int []numbers){
		int answer =0;
		
		int max = 5;
		int min = 0;
		if(numbers.length <= max || numbers.length >= min) {
			System.out.println(numbers.length);
			 answer = numbers.length;
		}
	
		System.out.println(answer);
		return answer;
		
	}

}

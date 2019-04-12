package ie.tudublin.sqa;
/**
 * 
 * @author I342031
 * This class is designed to throw a number format exception when trying to parse a String
 */

public class ErrorHandling {

	public ErrorHandling() {
		// TODO Auto-generated constructor stub
	}
	
	public String checkNumber(String num)
	{
		//int ans = num + num;
		int i = Integer.parseInt(num);
		System.out.println("int value = " + i);
		return num;
	}

}

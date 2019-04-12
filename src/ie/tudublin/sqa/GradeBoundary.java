package ie.tudublin.sqa;
/**
 * 
 * @author I342031
 * This class checks whether a grade value is within its boundary
 */
public class GradeBoundary {

	public GradeBoundary() {
		// TODO Auto-generated constructor stub
	}
	
	
	public char checkmark(int mark) {
		 if (mark >= 75) {
	         return 'A';
	      } else if (mark >= 60) {
	         return 'B';
	      } else if (mark > 50) {   // an logical error here
	         return 'C';
	      } else {
	         return 'F';
	}
	}

}

package ie.tudublin.sqa;

/**
 * 
 * @author I342031
 * This class is used to illustrate code coverage, i.e how much of code is executed when unit tests are run
 */
public class MeasureCodeCoverage {

	public MeasureCodeCoverage() {
		// TODO Auto-generated constructor stub
	}
	
	public String concat(boolean append, String a,String b) {
        String result = null;
         if(append) {
            result = a + b;
                            }
        return result.toLowerCase();
    }

}

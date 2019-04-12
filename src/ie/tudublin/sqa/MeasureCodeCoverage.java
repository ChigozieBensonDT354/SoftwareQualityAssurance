package ie.tudublin.sqa;

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

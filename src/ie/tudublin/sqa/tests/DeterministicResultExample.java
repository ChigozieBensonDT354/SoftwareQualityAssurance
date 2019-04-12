package ie.tudublin.sqa.tests;
/**
 * 
 * @author I342031
 *  In this case, each time the calculateTime method is executed, it will return a different value. 
	Writing a test case for this method would not be of any use as the output of the method is variable. 
	Thus, the test method will not be able to verify the output for any particular execution.

 */

public class DeterministicResultExample {

	 private void veryComplexFunction(){
	        //This is a complex function that has a lot of database access and is time consuming
	        //To demo this method, I am going to add a Thread.sleep for a random number of milliseconds
	        try {
	            int time = (int) (Math.random()*100);
	            Thread.sleep(time);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	    public long calculateTime(){
	        long time = 0;
	        long before = System.currentTimeMillis();
	        veryComplexFunction();
	        long after = System.currentTimeMillis();
	        time = after - before;
	        return time;
	    }
}

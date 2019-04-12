package ie.tudublin.sqa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ie.tudublin.sqa.MeasureCodeCoverage;

/**
 * 
 * @author I342031
 *Example: In this case, the test is executed with a value of true. 
 *When the test is executed, it will pass.
 * When a code coverage tool is run, it will show 100% code coverage as all the code in the concat method is executed. 
 * However, if the test is executed with a value of false, a NullPointerException will be thrown
The concat method below accepts a boolean value as input, and appends the two strings passed in only if the boolean value is true:


 */
class MeasureCodeCoverageTest {

	 @Test
     public void testStringUtil() {
	  MeasureCodeCoverage measure = new MeasureCodeCoverage();
      String result = measure.concat(true, "Hello ", "World");
      System.out.println("Result is "+result);
     }

}

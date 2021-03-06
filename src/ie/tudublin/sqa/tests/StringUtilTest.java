package ie.tudublin.sqa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ie.tudublin.sqa.StringUtil;


/**
 * 
 * @author I342031
 *This class illustrates how we want our developers to use assertions instead of system.out.print's
 */
class StringUtilTest {

	 @Test
	    public void testStringUtil_Bad() {
		 StringUtil st = new StringUtil();
	         String result = st.concat("Hello ", "World");
	         //This is NOT what we want
	         System.out.println("Result is "+result);
	    }
	    @Test
	    public void testStringUtil_Good() {
	    	StringUtil st = new StringUtil();
	         String result = st.concat("Hello ", "World");
	         //This is what we want
	         assertEquals("Hello World", result);
	    }

}

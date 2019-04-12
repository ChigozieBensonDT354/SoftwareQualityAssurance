package ie.tudublin.sqa.tests;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the test for the error handling class, we expect to recieve a number format exception,
 *  as we are passing a String to be parsed into an integer
 */

import org.junit.jupiter.api.Test;

import ie.tudublin.sqa.Examples;

class ErrorHandlingTest {

	@Test
	public void checkIsNumber() {
		Examples ex = new Examples();
		 assertThrows(NumberFormatException.class, () -> {
		        ex.checkNumber("hi");
		    });
		
	}

}

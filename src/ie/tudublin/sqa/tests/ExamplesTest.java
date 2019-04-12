package ie.tudublin.sqa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ie.tudublin.sqa.Examples;
/**
 * 
 * @author I342031
 * This class is used to test for independent paths, we pass in a number we know is in the list, we expect to be returned "FOUND"
 * and a number we know is not in the list, we expect to be returned "NOT FOUND" 
 */
class ExamplesTest {

	@Test
	void testSearchNum() {
		Examples ex = new Examples();
		assertEquals("FOUND",ex.searchNumbers(1)); 
	}
	
	@Test
	void testNumNotInList() {
		Examples ex = new Examples();
		assertEquals("NOT FOUND",ex.searchNumbers(9)); 
	}
	
	@Test
	public void testCheckIsNumber() {
		Examples ex = new Examples();
		 assertThrows(NumberFormatException.class, () -> {
		        ex.checkNumber("hi");
		    });
		
	}


}

package ie.tudublin.sqa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ie.tudublin.sqa.Examples;

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

package ie.tudublin.sqa.tests;

import static org.junit.jupiter.api.Assertions.*;

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

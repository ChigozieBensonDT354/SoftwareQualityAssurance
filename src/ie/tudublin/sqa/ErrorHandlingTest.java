package ie.tudublin.sqa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ErrorHandlingTest {

	@Test
	public void checkIsNumber() {
		Examples ex = new Examples();
		 assertThrows(NumberFormatException.class, () -> {
		        ex.checkNumber("hi");
		    });
		
	}

}

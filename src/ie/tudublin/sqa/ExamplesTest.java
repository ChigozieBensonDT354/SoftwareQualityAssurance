package ie.tudublin.sqa;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamplesTest {

	@Test
	void testSearchNum() {
		Examples ex = new Examples();
		assertEquals("FOUND",ex.searchNumbers(1)); 
	}

}

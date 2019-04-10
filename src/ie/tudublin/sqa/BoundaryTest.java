package ie.tudublin.sqa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BoundaryTest {
int []maxBoundary = new int[5];
int []minBoundary = new int[0];

	@Test
	void maxBoundaryTest() {
		Boundary bound = new Boundary();
		assertEquals(maxBoundary.length,bound.addNumbers(maxBoundary));
	}
	
	@Test
	void minBoundaryTest() {
		Boundary bound = new Boundary();
		assertEquals(minBoundary.length,bound.addNumbers(minBoundary));
	}

}

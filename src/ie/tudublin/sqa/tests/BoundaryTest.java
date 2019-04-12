package ie.tudublin.sqa.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ie.tudublin.sqa.Boundary;
/**
 * 
 * @author I342031
 * o	Let's say you need to test something that adds up to 5 numbers together. 
 * Your first boundary test would be to pass a list containing no items, the lower boundary. 
 * Your next test would be to pass a list that contains 5 numbers, the upper boundary. Boundary tests are often easy to write as you try to test the maximum or minimum (or a combination of them) parameter values.
 *  Please see the exam below
 *
 */
class BoundaryTest {
int []maxBoundary = new int[5];
int []minBoundary = new int[0];

	@Test
	void maxBoundaryTest() {
		Boundary bound = new Boundary();
		assertEquals(5,bound.addNumbers(maxBoundary));
	}
	
	@Test
	void minBoundaryTest() {
		Boundary bound = new Boundary();
		assertEquals(minBoundary.length,bound.addNumbers(minBoundary));
		
	}

}

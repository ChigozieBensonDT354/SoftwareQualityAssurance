package ie.tudublin.sqa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ie.tudublin.sqa.GradeBoundary;
/**
 * 
 * @author I342031
 * This class tests the boundaries defined in the GradeBoundaryClass
 */
class GradeBoundaryTest {

	@Test
	void testGrade() {
		GradeBoundary grade = new GradeBoundary();
		assertEquals("wrong grade", 'A', grade.checkmark(75));
	      assertEquals("wrong grade", 'B', grade.checkmark(72));
	      assertEquals("wrong grade", 'C', grade.checkmark(55));
	      assertEquals("wrong grade", 'C', grade.checkmark(50));
	}

}

package TestingTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleTypeTest {
	
	private TriangleType triangle;
	
	@Before
	void setUp() throws Exception {
		
	}
	
	@After
	void tearDown() throws Exception {
		triangle = null;
	}
	
	@Test
	public void possibletest() {
		triangle = new TriangleType(10,10,10);
		assertFalse(triangle.isImpossible());
	}
	@Test
	public void impossibletest() {		
		triangle = new TriangleType(-10,10,10);
		assertTrue(triangle.isImpossible());
	}
	@Test
	public void Areatest() {
		triangle = new TriangleType(10,10,10);
		double result = triangle.getArea();
		assertEquals(Math.sqrt(1875),result);
	}
	@Test
	public void Area2test() {
		triangle = new TriangleType(-10,10,10);
		double result = triangle.getArea();
		assertEquals(-1,result);
	}
	@Test
	public void classifytest() {
		triangle = new TriangleType(10,10,10);
		assertEquals(TriangleType.P_EQUILATERAL,triangle.classify());
		
	}
	
}
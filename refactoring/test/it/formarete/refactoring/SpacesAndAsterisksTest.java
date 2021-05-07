package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpacesAndAsterisksTest {

	@Test
	void test1_1() {
		//given
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		//when
		String output = triangle.writeTriangle(1);
		
		//then
		assertEquals("*",output);
	}
	
	@Test
	void test1_2() {
		//given
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		//when
		String output = triangle.writeTriangle(3);
		
		//then
		assertEquals("***",output);
	}
	
	@Test
	void test1_3() {
		//given
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		//when
		String output = triangle.writeTriangle(5);
		
		//then
		assertEquals("*****",output);
	}
	
	@Test
	void test1_4() {
		//given
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		//when
		String output = triangle.writeTriangle(7);
		
		//then
		assertEquals("*******",output);
	}
	
	@Test
	void test2_1() {
		
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		String output2 = triangle.writeSpaces(1);

		assertEquals("   ", output2);

		
	}
	
	@Test
	void test2_2() {
		
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		String output2 = triangle.writeSpaces(3);

		assertEquals("  ", output2);

		
	}
	
	
	@Test
	void test2_3() {
		
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		String output2 = triangle.writeSpaces(5);

		assertEquals(" ", output2);

		
	}
	
	
	@Test
	void test2_4() {
		
		TriangleAsterics triangle = new TriangleAsterics(7);
		
		String output2 = triangle.writeSpaces(7);

		assertEquals("", output2);

		
	}

}

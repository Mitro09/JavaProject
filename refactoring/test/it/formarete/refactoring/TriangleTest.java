package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTest {
	Triangle triangle;
	/*
	 * @Test public void testBuild() { // given Triangle triangle = new Triangle(4);
	 * 
	 * // when String output = triangle.build();
	 * 
	 * // then assertEquals( "   *\n" + "  ***\n" + " *****\n" + "*******\n",
	 * output); }
	 */

	@BeforeAll
	public static void setUpAll() {

	}

	@AfterAll
	public static void tearDownAll() {

	}

	@BeforeEach
	public void setUp() {
		triangle = new Triangle(4);

	}

	@AfterEach
	public void tearDown() {

	}

	@Test
	public void testBuildSpaces1() {
		setUp();
		String output = triangle.buildSpaces(0);
		assertEquals("   ", output);
	}

	@Test
	public void testBuildSpaces2() {
		setUp();
		String output = triangle.buildSpaces(1);
		assertEquals("  ", output);
	}

	@Test
	public void testBuildSpaces3() {
		setUp();
		String output = triangle.buildSpaces(2);
		assertEquals(" ", output);
	}

	@Test
	public void testBuildSpaces4() {
		setUp();
		String output = triangle.buildSpaces(3);
		assertEquals("", output);
	}
	
	
	@Test
	public void testBuildAsterisks1() {
		setUp();
		String output = triangle.buildAsterisks(0);
		assertEquals("*",output);
	}
	
	@Test
	public void testBuildAsterisks2() {
		setUp();
		String output = triangle.buildAsterisks(1);
		assertEquals("***",output);
	}
	
	@Test
	public void testBuildAsterisks3() {
		setUp();
		String output = triangle.buildAsterisks(2);
		assertEquals("*****",output);
	}
	
	@Test
	public void testBuildAsterisks4() {
		setUp();
		String output = triangle.buildAsterisks(3);
		assertEquals("*******",output);
	}
}

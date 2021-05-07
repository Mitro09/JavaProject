package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrameTest {

	@Test
	void testEvenRowsOddColumns() {
		//fail("Not yet implemented");
		//assertEquals(true,true,"true is not false");
		
		//given
		Frame frameTest1 = new Frame(7,10,"ciao");
		
		//when
		String output = frameTest1.build();
		
		//then
		assertEquals(
				  "* * * * * * * \n"
				+ "*           * \n"
				+ "*           * \n"
				+ "*           * \n"
				+ "*           * \n"
				+ "*    ciao   * \n"
				+ "*           * \n"
				+ "*           * \n"
				+ "*           * \n"
				+ "* * * * * * * \n",output);
				
	}
	
	
	@Test
	void testOddRowsEvenColumns() {
		Frame frameTest2 = new Frame(10,7,"ciao");
		assertEquals(
				  "* * * * * * * * * * \n"
				+ "*                 * \n"
				+ "*                 * \n"
				+ "*       ciao      * \n"
				+ "*                 * \n"
				+ "*                 * \n"
				+ "* * * * * * * * * * \n",frameTest2.build());
	}
	
	@Test
	void testOddSquare() {
		Frame frametest3 = new Frame(13,13,"ciao");
		assertEquals(
				  "* * * * * * * * * * * * * \n"
			     +"*                       * \n"
			     +"*                       * \n"
				 +"*                       * \n"
				 +"*                       * \n"
				 +"*                       * \n"
				 +"*          ciao         * \n"
				 +"*                       * \n"
				 +"*                       * \n"
				 +"*                       * \n"
				 +"*                       * \n"
				 +"*                       * \n"
				 +"* * * * * * * * * * * * * \n",frametest3.build());	  
		
	}
	@Test
	void testEvenSquare() {
		Frame frametest4 = new Frame(10,10,"ciao");
		assertEquals(
				"* * * * * * * * * * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*       ciao      * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* * * * * * * * * * \n",frametest4.build());
	
	}
	
	@Test
	void testLabelNull() {
		Frame frametest5 = new Frame(10,10,"");
				assertEquals(
				"* * * * * * * * * * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* * * * * * * * * * \n",frametest5.build());
	}
	
	@Test
	void testLabelLenghtFull() {
		Frame frametest6 = new Frame(10,10,"1234567891234567");
		assertEquals(
				"* * * * * * * * * * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* 1234567891234567* \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* * * * * * * * * * \n",frametest6.build());
	}
	
	@Test
	void testLabelSmashFrame() {
		Frame frametest6 = new Frame(10,10,"123456789123123456789123");
		assertEquals(
				"* * * * * * * * * * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*   123456789123  * \n"
			   +"*   123456789123  * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* * * * * * * * * * \n",frametest6.build());

	}
	
	
	@Test
	void testLabelSmashFrameIncorrect() {
		Frame frametest6 = new Frame(10,10,"123456789123456789101112");
		assertEquals(
				"* * * * * * * * * * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* 123456789123456789101112* \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* * * * * * * * * * \n",frametest6.build());

	}
	
	@Test
	void testLabelSmashFrameOdd() {
		Frame frametest6 = new Frame(10,10,"1234567891231234567891234");
		assertEquals(
				"* * * * * * * * * * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*   123456789123  * \n"
			   +"*  1234567891234  * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"*                 * \n"
			   +"* * * * * * * * * * \n",frametest6.build());

	}

}



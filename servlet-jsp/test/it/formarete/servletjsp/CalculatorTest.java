package it.formarete.servletjsp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator calc = new Calculator();
		
		int sum = calc.sum(2,3);
		
		assertEquals(5,sum);
	}

}

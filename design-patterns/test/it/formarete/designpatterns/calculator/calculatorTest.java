package it.formarete.designpatterns.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class calculatorTest {

	@Test
	public void TestSum() {
		//parte given
		Calculator calc = new CalculatorImpl();
		
		//fase when
		int sum = calc.sum(2, 3);
		
		//then 
		assertEquals(5, sum);
	}
}

package it.formarete.designpatterns.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.calculator.inheritance.ValidatingCalculator;


public class InheritanceTest {

	@Test
	public void testCorrectInput() {
		Calculator calc = new ValidatingCalculator();
		assertEquals(5, calc.sum(2,3));
		assertEquals(5, ((ValidatingCalculator) calc).isValid(2,3));
	}
	
	@Test
	public void testInvalidInput() {
		Calculator calc = new ValidatingCalculator();
		assertThrows(IllegalArgumentException.class, () -> ((ValidatingCalculator) calc).isValid(null, 3));
	}
	
}

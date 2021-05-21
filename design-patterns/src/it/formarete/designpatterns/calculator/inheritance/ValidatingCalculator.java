package it.formarete.designpatterns.calculator.inheritance;

import it.formarete.designpatterns.calculator.CalculatorImpl;

public class ValidatingCalculator extends CalculatorImpl {

	public int isValid(Integer firstNum, Integer secondNum) {
		 if (firstNum != null & secondNum != null) {
			return super.sum(firstNum, secondNum);
		 }
		 else {
			throw new IllegalArgumentException("One of the two parameters is null");
		 }
	}
	
	public int sum (Integer firstNum, Integer secondNum) {
	//qua cercavo di sapere se l'input è valido o meno, e lo chiedo ad un qualche oggetto validatore
		
	//Boolean isValid = validator.isValid(firstNum, secondNum);
	return firstNum + secondNum;
	}
}

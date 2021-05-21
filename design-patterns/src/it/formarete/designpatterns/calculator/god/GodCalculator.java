package it.formarete.designpatterns.calculator.god;

import it.formarete.designpatterns.calculator.Calculator;

public class GodCalculator implements Calculator{

	@Override
	public int sum(Integer firstNum, Integer secondNum) {
		System.out.println("Input: " + firstNum + ", " + secondNum);
		
		
		if(!isValid(firstNum,secondNum)) {
			throw new IllegalArgumentException("One of the two parameters is null");
		}
		Integer sum = firstNum + secondNum;
		
		System.out.println("Output: " + sum );
		
		return sum;
	}

	private boolean isValid(Integer firstNum, Integer secondNum) {
		return firstNum != null & secondNum != null;
	}
}

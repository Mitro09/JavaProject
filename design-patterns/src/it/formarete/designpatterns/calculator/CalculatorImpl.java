package it.formarete.designpatterns.calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int sum(Integer firstNum, Integer secondNum) {
		return firstNum + secondNum;
	}
}

package it.formarete.designpatterns.mvc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import it.formarete.designpatterns.mvc.decorator.ObservableDecorator;
import it.formarete.designpatterns.mvc.inheritance.ObservableModel;

public class DecoratorTest {

	
	@Test
	public void decoratorTest() {
		Model model = new ModelImpl();
		View view = new View();
		Controller controller = new Controller();
		model = new ObservableDecorator(model);
		controller.setModel(model);
		((ObservableDecorator)model).registerObserver(view);
		
		controller.handleInput("world");
		
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
		
	}
}

package it.formarete.designpatterns.mvc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import it.formarete.designpatterns.mvc.strategy.ModelWithSubject;

public class StrategyTest {

	@Test 
	public void TestNotifyObserver() {
		
		View view = new View();
		Model model = new ModelImpl();
		Controller controller = new Controller();
		controller.setModel(model);
		ModelWithSubject modws = new ModelWithSubject (view, "world");
		
		controller.handleInput("world");
		
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
	}

}

package it.formarete.designpatterns.mvc;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mvc.god.GodModel;

public class ControllerTest {

	@Test 
	public void testGodObject() {
		
		//given 
		Model model = new GodModel();//deve essere un subject che notifica i cambiamenti 
		View view = new View();
		Controller controller = new Controller();
		controller.setModel(model);//imposto il modello come modello del controller
		((GodModel)model).registerObserver(view);
		
		
		//when 
		controller.handleInput("world");
		
		//then 
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>.", model.getAttribute());
	}
}

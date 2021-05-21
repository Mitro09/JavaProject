package it.formarete.designpatterns.mvc;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mvc.inheritance.ObservableModel;

public class InheritanceViewModelTest {

	@Test
	public void TestNotifyObserver() {
	
		 // given
        Model model = new ModelImpl();
        Controller controller = new Controller();
        controller.setModel(model); //questa riga è il collegamento tra il controller e il model
        ObservableModel obm = new ObservableModel();

        View view = new View();
        obm.registerObserver(view);

        // when

        controller.handleInput("world");
        view.update("world");

        // then

        assertEquals("world", model.getAttribute());
        assertEquals("<h1>Hello world!</h1>", view.render());
		
	
	}
}

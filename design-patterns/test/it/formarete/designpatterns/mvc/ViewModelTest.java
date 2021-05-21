package it.formarete.designpatterns.mvc;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ViewModelTest {

	@Test 
	public void shouldPassDataToView() {
		//given 
		//il test deve verificare che il nostro view model riesca a passare i dati dal modello alla vista
		Model model = new ModelImpl();
		View view = new View();
		ViewModel vm = new ViewModel();//collega modello e vista e deve avere un riferimento concreto sia a modello che vista
		vm.setModel(model);
		vm.setView(view);
		//abbiamo creato gli oggetti e il collegamento tra di essi
		
		
		//when qui chiediamo al controller di gestire l'input
		vm.handleInput("world");
		
		//then 
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
	}
}

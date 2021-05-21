package it.formarete.designpatterns.mvc;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ViewTest {
	@Test
	public void shouldInit() {
		//given 
		//in questa fase dichiariamo una vista
		View view = new View();
		
		//when 
		//in questa fase non faccimao niente
		
		
		//then
		assertEquals("<h1>Hello nobody!</h1>", view.render());
		//il test certifica che la vista abbi ail metodo render funzionante
	}
	
	
	@Test
	//ma che succede se gli passiamo qualcosa e la vista si aggiorna? famo er test
	
	//given
	public void shouldUpdate() {View view = new View();
	
	//when -> la vista si aggiorna
	view.update("world");
	
	//then -> allora fase then, voglio che la stringa cambi 
	assertEquals("<h1>Hello world!</h1>", view.render());
  }
}

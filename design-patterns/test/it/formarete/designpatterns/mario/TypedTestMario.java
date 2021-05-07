package it.formarete.designpatterns.mario;

import org.junit.jupiter.api.Test;


import it.formarete.designpatterns.typed.mario.BaseType;
import it.formarete.designpatterns.typed.mario.CapeType;
import it.formarete.designpatterns.typed.mario.FireType;
import it.formarete.designpatterns.typed.mario.SuperType;
import it.formarete.designpatterns.typed.mario.TypedMario;
import it.formarete.designpatterns.typed.mario.UltraType;

public class TypedTestMario {

	@Test
	public void testBaseMario() {
		Mario mario = new TypedMario(new BaseType());
		
		TestHelper.testBaseMario(mario);
	}
	
	@Test
	public void testSuperMario() {
		Mario mario = new TypedMario(new SuperType());
		
		TestHelper.testSuperMario(mario);
	}
	
	@Test
	public void testFireMario() {
		Mario mario = new TypedMario(new FireType());
		
		TestHelper.testFireMario(mario);
	}
	
	@Test
	public void testCapeMario() {
		Mario mario = new TypedMario(new CapeType());
		
		TestHelper.testCapeMario(mario);
	}
	
	@Test
	public void testMushroom() {
		Mario mario = new TypedMario(new BaseType());
		TestHelper.testBaseMario(mario);
		((TypedMario)mario).setType(new SuperType());
		TestHelper.testSuperMario(mario);
	}
	
	@Test
	public void testUltraMario() {
		Mario mario = new TypedMario(new UltraType());
		
		TestHelper.testUltraMario(mario);
	}
	
}

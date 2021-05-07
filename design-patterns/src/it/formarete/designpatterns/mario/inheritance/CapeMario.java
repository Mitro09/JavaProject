package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class CapeMario extends SuperMario {

	
	@Override
	public String onKeyPressed(KeyCode kc) {
		switch(kc) {
		
		case JUMP:
			return "fly";
	
		default:
			return super.onKeyPressed(kc);
		}
	}
}

package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class FireMario extends SuperMario {

	
	@Override
	public String onKeyPressed(KeyCode kc) {
		switch(kc) {
		
		case ACTION:
			return "fire";
		default:
			return super.onKeyPressed(kc);
		}
	}
}

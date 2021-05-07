package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class UltraMario extends SuperMario{
	
	@Override
	public String onKeyPressed(KeyCode kc) {
		switch(kc) {

		case JUMP:
			return "fly";
		
		case ACTION:
			return "fire";
			
		default:
			return super.onKeyPressed(kc);
		}
	}
}

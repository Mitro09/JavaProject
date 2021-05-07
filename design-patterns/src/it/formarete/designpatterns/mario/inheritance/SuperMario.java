package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class SuperMario extends BaseMario {

	@Override
	public String onKeyPressed(KeyCode kc) {
		switch(kc) {
		case DOWN:
			return "stomp";
		default:
			return super.onKeyPressed(kc);
		}
	}

}

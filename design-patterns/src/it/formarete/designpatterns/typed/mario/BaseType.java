package it.formarete.designpatterns.typed.mario;

import it.formarete.designpatterns.mario.KeyCode;

public class BaseType implements Type {

	@Override
	public String onKeyPressed(KeyCode kc) {
		switch(kc) {
		case DOWN:
			return "crouch";
		case JUMP:
			return "jump";
		case ACTION:
			return "run";
		default:
			return "";
		}
	}

	
	
}



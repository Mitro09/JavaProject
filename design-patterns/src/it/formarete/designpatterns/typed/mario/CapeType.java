package it.formarete.designpatterns.typed.mario;

import it.formarete.designpatterns.mario.KeyCode;

public class CapeType implements Type {

	@Override
	public String onKeyPressed(KeyCode kc) {
		switch(kc) {
		case DOWN:
			return "stomp";
		case JUMP:
			return "fli";
		case ACTION:
			return "run";
		default:
			return "";
		}
	}

}

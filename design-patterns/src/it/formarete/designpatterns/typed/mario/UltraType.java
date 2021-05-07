package it.formarete.designpatterns.typed.mario;

import it.formarete.designpatterns.mario.KeyCode;

public class UltraType implements Type {

	@Override
	public String onKeyPressed(KeyCode kc) {
		switch(kc) {
		case DOWN:
			return "stomp";
		case JUMP:
			return "fly";
		case ACTION:
			return "fire";
		default:
			return "";
		}
	}

}

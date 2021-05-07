package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class BaseMario implements Mario {

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

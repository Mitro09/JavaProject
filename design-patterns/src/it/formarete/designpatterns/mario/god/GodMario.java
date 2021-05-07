package it.formarete.designpatterns.mario.god;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class GodMario implements Mario {

	private Type type;

	public GodMario(Type type) {
		this.type = type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String onKeyPressed(KeyCode kc) {
		/*
		 * switch(this.type) { case BASE: switch (kc) { case DOWN: return "crouch";
		 * 
		 * case JUMP: return "jump";
		 * 
		 * case ACTION: return "run"; default: return ""; }
		 * 
		 * case SUPER: switch (kc) { case DOWN: return "stomp";
		 * 
		 * case JUMP: return "jump";
		 * 
		 * case ACTION: return "run"; default: return ""; }
		 * 
		 * 
		 * case FIRE: switch (kc) { case DOWN: return "stomp";
		 * 
		 * case JUMP: return "jump";
		 * 
		 * case ACTION: return "fire"; default: return ""; }
		 * 
		 * case CAPE: switch (kc) { case DOWN: return "stomp";
		 * 
		 * case JUMP: return "fly";
		 * 
		 * case ACTION: return "run"; default: return ""; }
		 * 
		 * case ULTRA: switch(kc) { case DOWN: return "stomp";
		 * 
		 * case JUMP: return "fly";
		 * 
		 * case ACTION: return "fire"; default: return "";
		 * 
		 * }
		 * 
		 * 
		 * default: return ""; }
		 */

		switch (kc) {
		case DOWN:
			return type == Type.BASE ? "crouch" : "stomp";

		case JUMP:
			switch (this.type) {
			case CAPE:
			case ULTRA:
				return "fly";
			default:
				return "jump";
			}
			
		case ACTION:
			switch (this.type) {
			case FIRE:
			case ULTRA:
				return "fire";
			default:
				return "run";
			}
			
		default:
			return "";
		}

	}
}



package it.formarete.designpatterns.uazzappe;

import java.util.ArrayList;
import java.util.List;

public class App implements Client{
	
	private String nome;
	private List<String> messaggi = new ArrayList<>();
	private Subject server;
	
	public App(String nome) {
		this.nome = nome;
	}
	
	
	public void setServer(Subject server){
		this.server = server;
	}
	
	public void send(String message) {
		server.receive("["+nome+"]: "+message);
	}
	
	public void receive(String message) {
		messaggi.add(message);
	}

	public List<String> getMessages() {
		return this.messaggi;
	}

	
	
	
}

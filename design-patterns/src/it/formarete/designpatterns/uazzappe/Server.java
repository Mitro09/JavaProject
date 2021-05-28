package it.formarete.designpatterns.uazzappe;

import java.util.ArrayList;
import java.util.List;

public class Server extends Subject{
	
	private List<String> messaggi = new ArrayList<String>();
	private List<Client> clients = new ArrayList<Client>(); 
	
	
	
	public void register(Client client) {
		super.register(client);
		
	}
	
	public void receive(String message) {
		messaggi.add(message);
		for (Client client:clients) {
			client.receive(message);
		}
	}
	
	public List<String> getMessages() {
		return messaggi;
	}
	
	

}

package it.formarete.designpatterns.uazzappe;

public interface Client {
	
	public void setServer(Subject server);
	
	public void receive(String message);

}

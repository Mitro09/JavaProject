package it.formarete.designpatterns.uazzappe;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


class UazzappeTest {
	  @Test
	  void shouldSendAndReceiveMessages() {
	    // given
	    Server server = new Server();

	    App alice = new App("Alice");
	    App bob = new App("Bob");

	    server.register(alice);
	    server.register(bob);

	    List<String> expectedMessages = new ArrayList<>();
	    expectedMessages.add("[Alice]: Hello world!");
	    expectedMessages.add("[Bob]: Hey, how are you?");
	    expectedMessages.add("[Alice]: I'm good, thank you!");

	    // when
	    alice.send("Hello world!");
	    bob.send("Hey, how are you?");
	    alice.send("I'm good, thank you!");

	    // then
	    assertEquals(expectedMessages, server.getMessages());
	    assertEquals(expectedMessages, alice.getMessages());
	    assertEquals(expectedMessages, bob.getMessages());
	  }
	}
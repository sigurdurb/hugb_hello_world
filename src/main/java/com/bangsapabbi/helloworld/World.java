package com.bangsapabbi.helloworld;
import net.joningi.icndb.ICNDBClient;
import net.joningi.icndb.Joke;

public class World {

    final ICNDBClient client = new ICNDBClient();

    private String greeting = "Hello world!";

    public String greet() {
        return greeting;
    
    }
    public String getJoke() {
	World randomJoke = client.getRandom();
	return randomJoke.getJoke();
    }
}

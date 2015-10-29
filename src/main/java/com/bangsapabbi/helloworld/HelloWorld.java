package com.bangsapabbi.helloworld;


import static spark.Spark.*;

public class HelloWorld {

    
    public static void main(String[] args) {

	World world = new World();    
	//        Joke joke = client.getById(15);
	String port = system.getenv("PORT");
	if(port != null){
	    setPort(Integer.valueOf(port));
	}
	   
	get("/random",(req,res) -> world.getJoke());
	
    }
    
    /*
    public static Joke getj(){

	return client.getById(15);
    }
    public static String getJokes(){
	retun "asdf";
    }
    */
    
}

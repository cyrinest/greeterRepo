package edu.esprit.greeter;

public class Greeter {
	public String v1;
	public String v2;
public String sayHello(String name){
	
if(name.equals("MAN"))
	throw new IllegalArgumentException();
 return "hello" +name;

	}
}



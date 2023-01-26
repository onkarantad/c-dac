package oops.oops_blueprint;

public class Interfaces implements Jeep,Man {
	

	@Override
	public void start() {
		System.out.println("Jeep is starting");
		
	}

	@Override
	public void walk() {
		System.out.println("bumble-bee is walking");		
	}

}

// interface are by default public and abstract
interface Jeep{
	void start();  //this is abstract so it wont contain body so it ends with semicolon 
}

interface Man{
	void walk();
}

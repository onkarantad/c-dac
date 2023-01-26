package oops.oops_blueprint;

public class Abstraction {

	public static void main(String[] args) {
		
		Car a1 = new Audi();
		a1.start();

	}

}

class Audi extends Car{

	@Override
	void start() {
		System.out.println("Audi is starting");		
	}
	
}

class BMW extends Car{

	@Override
	void start() {
		System.out.println("BMW is starting");	
		
	}
	
}



// this car is just a concept so we don't to create its object so make it as abstract
// if we make it abstract class
// and abstract method can have definition but 
// interface don't have definition (so interface is true 100% abstraction)
// and we must override that method to its parent class

//class Car{
//	int price;
//
//	void start() {
//		System.out.println("car is starting");
//	}
//}

 abstract class Car{
	int price;

	abstract void start();
}




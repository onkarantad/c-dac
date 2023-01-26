package oops.oops_blueprint;

import oops.oops_encapsulation.EncapsulationIntro;

public class Real {

	public static void main(String[] args) {

//		// instance of class Person
//		Person p1 = new Person();
//		p1.age = 21;
//		p1.name = "onkar";
//		System.out.println(p1);
//
//		p1.eat();
//
//		p1.walk();
//		p1.walk(5); // overloading (compile time polymorphism)
//		Person p2 = new Person("onkar2", 23); // constructer overloading
//		System.out.println(Person.count);
//
//		Developer d1 = new Developer();
//		d1.age = 25;
//		d1.name = "onkar3";
//		Developer d2 = new Developer("onkar4", 24);
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(Developer.count);
//		d1.walk();
		
		EncapsulationIntro enc = new EncapsulationIntro();
		enc.doWork();
		// if we remove public from EncapsulationIntro doWork then
		// above doWork wont work so we are getting encapsulation 
		
		// encapsulation => getting from access modifiers public,private,protected

	}

}

// blue print with which object can be created
class Person {
	String name; // property
	int age; // property
	static int count;

	@Override
	public String toString() // behavear
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person() {
		super();
		count++;
		System.out.println("object is created");

	}

	public Person(String name, int age) {
		this(); // will call parametless constructer beacuse no argument is passed , if we pass
				// argument then releated
				// construcetr is called
		this.name = name;
		this.age = age;
	}

	void walk() // behavear
	{
		System.out.println(name + " is walking");
	}

	void walk(int step) // overloading (compile time polymorphism)
	{
		System.out.println(name + " is walking " + step + " step");
	}

	void eat() // behavear
	{
		System.out.println(name + " is eating");
	}

	void doWork() {
		System.out.println("person is working");
	}

}

class Developer extends Person // class Developer is inheriting class Person
{

	public Developer() {
		super(); // call parameterless constructor of its parent class
	}

	public Developer(String name, int age) {
		super(name, age); // call parameterized constructor of its parent class
	}

	@Override
	void walk() // runtime polymorphism
	{
		System.out.println("developer is walking");
	}
	
	

}

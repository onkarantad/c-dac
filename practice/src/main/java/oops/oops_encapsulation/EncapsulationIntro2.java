package oops.oops_encapsulation;

public class EncapsulationIntro2 {
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(31);
		
		System.out.println(l1.getPrice());
	}
	

	
	
	public void doWork() {
		System.out.println("working and working");
	}
}


class Laptop{
	int ram;
	private int price;
	
	public void setPrice(int price) {
		// is teh user the admin 
		boolean isAdmin= true;
		if(!isAdmin) {
			System.out.println("cant set price");
		}
		else {
			this.price=price;
		}
		this.price=price;
	
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
	
}

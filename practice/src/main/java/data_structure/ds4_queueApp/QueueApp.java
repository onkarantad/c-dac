package data_structure.ds4_queueApp;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		
	try(Scanner in = new Scanner(System.in)) {
		
		System.out.print("ENTER SIZE : ");
		int size = in.nextInt();
		QueueIntf q = new MyQueue(size);
		
		boolean exit=false;
		while(!exit)
		{
			System.out.println("==== Menu ==== "
					+ "\n 1. add array of element "
					+ "\n 2. delete element "
					+ "\n 3. Display  "
					+ "\n 4. add single element  "
					+ "\n 5. Exit");
			System.out.println("Choose Option");
			
			switch (in.nextInt()) {
			case 1:
				for(int i=0;i<size;i++) {
					System.out.print("arr["+ i + "] = ");
					q.add(in.nextInt());
					System.out.println();
				}
				break;
				
			case 2:
				q.delete();
				System.out.println();
				break;
				
			case 3:
				q.display();
				System.out.println();
				break;
				
			case 4 :
				System.out.print("add element : ");
					q.add(in.nextInt());
				break;
				
			case 5 :
				exit=true;
				break;

			default:
				System.out.println("enter valid input");
				break;
			}
			
		}

			
		} catch (Exception e) {
			System.out.println("error : " + e);
		}

	}

}

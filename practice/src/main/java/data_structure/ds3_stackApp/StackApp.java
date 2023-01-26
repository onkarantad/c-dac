package data_structure.ds3_stackApp;

import java.util.Scanner;

public abstract class StackApp implements StackIntf{
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
		
			System.out.print("ENTER SIZE : ");
			int size = in.nextInt();
			StackIntf s = new MyStack(size);
			
			
			boolean exit=false;
			while(!exit)
			{
				System.out.println("=====Menu===="
						+ "\n 1. push array of element  "
						+ "\n 2. pop element "
						+ "\n 3. Display "
						+ "\n 4. DisplayReverse "
						+ "\n 5. push single element  "
						+ "\n 6. Exit");
				System.out.println("Choose Option");
				
				switch (in.nextInt()) {
				case 1:
					for(int i=0;i<size;i++) {
						System.out.print("arr["+ i + "] = ");
						s.push(in.nextInt());
						System.out.println();
					}
					break;
					
				case 2:
					s.pop();
					System.out.println();
					break;
					
				case 3:
					s.display();
					System.out.println();
					break;
					
				case 4:
					s.displayRev();
					System.out.println();
					break;
					
				case 5 :
					System.out.print("push element : ");
					s.push(in.nextInt());
				break;
				
				case 6 :
					System.out.println("program terminated !!!");
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
	
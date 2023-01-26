package data_structure.ds4_queueApp;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		
	try(Scanner in = new Scanner(System.in)) {
		
		System.out.print("ENTER SIZE : ");
		int size = in.nextInt();
		QueueIntf q = new MyCircularQueue(size);
		
		boolean exit=false;
		while(!exit)
		{
			System.out.println("======= Menu ======= "
					+ "\n 1. add array of element "
					+ "\n 2. add single element "
					+ "\n 3. Display "
					+ "\n 4. delete element "
					+ "\n 5. check isEmpty or isFull"
					+ "\n 6. Exit");
			System.out.println("Choose Option");
			
			switch (in.nextInt()) {
			case 1:
					while(!q.isFull()) {
						System.out.print("arr["+ q.getRear() + "] = ");
						q.add(in.nextInt());
						System.out.println();
				}
					System.out.println("queue is full !!!");
				break;
				
			case 2:
				System.out.print("arr["+ q.getRear() + "] = ");
				q.add(in.nextInt());
				break;
				
			case 3:
				q.display();
				System.out.println();
				break;
				
			case 4 :
				q.delete();
				System.out.println();
				break;
				
			case 5 :
				if(!q.isEmpty() && !q.isFull())
					System.out.println("queue is partially filled");
				if(q.isFull())
					System.out.println("queue is Full");
//				for(int i=0;i<size;i++)
//				{
//					if(q.arr[i]==0);
//				}
					System.out.println("queue is Empty");
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

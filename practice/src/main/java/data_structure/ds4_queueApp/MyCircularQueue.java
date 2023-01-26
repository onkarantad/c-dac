package data_structure.ds4_queueApp;

public class MyCircularQueue implements QueueIntf {

	int[] arr;
	public int rear;
	public int front;
	int size;
	
	public MyCircularQueue(int size) {
		arr= new int[size];
		rear=0;
		front=0;
		this.size=size;
	}
	
	@Override
	public void add(int n) {
		System.out.print("added element : ");
		rear=(rear+1)%size;
		arr[rear] = n;
		 System.out.print("arr["+rear+"] = " + n + "\n");

	}

	@Override
	public int delete() {
		System.out.print("deleted element : ");
		front=(front+1)%size;
		 System.out.print("arr["+front+"] = " + arr[front] + "\n");
		 arr[front]=0;
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(front==rear)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if((rear+1)%size==front)
			return true;
		return false;
	}

	@Override
	public void display() {
		System.out.println("===== Queue elements are =====");
		for (int i=0;i<size;i++)
			System.out.println("arr["+i+"] = " + arr[i]);
		System.out.println("==============================");
	}

	@Override
	public int getRear() {
		int grear=rear;
		grear=(grear+1)%size;
		return grear;
	}

	@Override
	public int getFront() {
		int gfront=front;
		gfront=(gfront+1)%size;
		return gfront;
	}
	
	

}

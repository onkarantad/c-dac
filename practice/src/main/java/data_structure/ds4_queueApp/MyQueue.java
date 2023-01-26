package data_structure.ds4_queueApp;

public  class MyQueue implements QueueIntf {

	int[] arr;
	int rear;
	int front;
	int size;
	
	public MyQueue(int size) {
		arr= new int[size];
		rear=-1;
		front=-1;
		this.size=size;
	}
	
	@Override
	public void add(int n) {
		if(!isFull()) {
			System.out.print("add element : ");
			++rear;
			arr[rear] = n;
			 System.out.print("arr["+rear+"] = " + n + "\n");
		}
		else
			System.out.println("queue is full !!!");

	}

	@Override
	public int delete() {
		if(!isEmpty()) {
			System.out.print("delete element : ");
			++front;
			 System.out.print("arr["+front+"] = " + arr[front] + "\n");
			 arr[front]=0;
		}
		else
			System.out.println("queue is empty !!!");
			return -1;
		
		
	}

	@Override
	public boolean isEmpty() {
		System.out.println("isEmpty");
		if(front==rear)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		System.out.println("isFull");
		if(rear==(size-1))
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFront() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

}

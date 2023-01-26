package data_structure.ds3_stackApp;

public class MyStack implements StackIntf {
	
	int[] arr;
	int top;
	int size;
	
	public MyStack(int size) {
		arr=new int[size];
		top=-1;
		this.size=size;
	}
		
	@Override
	public void push(int n) {
		if(!isFull()) {
			System.out.print("push element : ");
			++top;
			arr[top] = n;
			 System.out.print("arr["+top+"] = " + n + "\n");
		}
		else
			System.out.print("stack is full !!! ");
	
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			System.out.print("pop element : ");
			int t = arr[top];
				System.out.print( "arr["+top+"] = " + t + "\n");
			arr[top] = 0;
			--top;
		}
		else
			System.out.print("stack is empty !!!");
			return -1;
	}

	@Override
	public boolean isEmpty() {
		System.out.println(" isEmpty");
		if(top==-1)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		System.out.println("isFull");
		if(top==(size-1))
			return true;
		return false;
	}

	@Override
	public void display() {
		System.out.println("===== Stack elements are =====");
		for (int i=0;i<size;i++)
			System.out.println("arr["+i+"] = " + arr[i]);
		System.out.println("==============================");
	}
	
	
	@Override
	public void displayRev() {
		System.out.println("===== Stack elements in Reverse are =====");
		for (int i=(size-1);i>=0;i--)
			System.out.println("arr["+i+"] = " + arr[i]);
		System.out.println("=========================================");
	}

}

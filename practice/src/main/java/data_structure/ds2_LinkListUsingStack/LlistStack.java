package data_structure.ds2_LinkListUsingStack;

public class LlistStack {

	class Node{
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	Node top;
	public LlistStack()
	{
		this.top=null;
	}
	
	@SuppressWarnings("unused")
	public void push(int x)
	{
		Node temp=new Node(x);
		if(isEmpty())
		{
//			System.out.print("\nHeap Overflow");
			top = temp;
			return;
		}
		temp.next=top;
		top=temp;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			return top.data;
		}
		else
			System.out.println("Stack is empty"); 
        return -1; 
	}

	public void pop()
	{
		if(isEmpty())
		{
			 System.out.println("Stack Underflow");
	            return; 
		}
		top=top.next;
	}
	
	
	public void Display()
	{
		if(isEmpty())
			 System.out.println("Stack Underflow");
		else {
			Node curr=top;
			while(curr!=null)
			{
				 System.out.println("|"+curr.data+"|");
				 curr=curr.next;
			}
		}
	}
	
}

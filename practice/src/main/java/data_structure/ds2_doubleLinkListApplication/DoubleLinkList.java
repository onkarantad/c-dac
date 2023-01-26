package data_structure.ds2_doubleLinkListApplication;

public class DoubleLinkList {

	class Node{
		int data;
		Node prv;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	
	Node head,tail=null;
	
	public void AppendStart(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=tail=newnode;
			head.prv=null;
			tail.next=null;
		}
		else {
			head.prv=newnode;
			newnode.next=head;
			newnode.prv=null;
			head=newnode;
		}
	}
	
	
	public void AppendLast(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=tail=newnode;
			head.prv=null;
			tail.next=null;
		}
		else {
			tail.next=newnode;
			newnode.next=null;
			newnode.prv=tail;
			tail=newnode;
		}
	}
	
	public void print()
	{
		Node curr=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		while(curr !=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();  
	}
	
	public void printrev()
	{
		Node curr=tail;
		if(tail==null)
		{
			System.out.println("List is Empty");
		}
		while(curr !=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.prv;
		}
		System.out.println();  
	}
}

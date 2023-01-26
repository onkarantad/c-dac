package data_structure.ds2_doubleLinkListApplication;

public class Tester {

	public static void main(String[] args) {
		DoubleLinkList dlist=new DoubleLinkList();
		
		System.out.println("Add At End");
		dlist.AppendStart(10);
		dlist.print();
		
		dlist.AppendStart(50);
		dlist.print();
		
		dlist.AppendStart(30);
		dlist.print();
		
		System.out.println("Add At End");
		dlist.AppendLast(40);
		dlist.print();
		
		dlist.AppendLast(70);
		dlist.print();
		
		System.out.println("Reverse list");
		dlist.printrev();

	}

}

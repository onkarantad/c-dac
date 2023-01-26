package data_structure.ds_tree_binary;

public class Tester {

	public static void main(String[] args) {
		BSTree bst = new BSTree();
		
		System.out.println("print elements - empty tree");
		if(bst.find(10))
			System.out.println("10 is found");
		else
			System.out.println("10 not found");
		
		bst.insert(20);
		bst.insert(10);
		bst.insert(40);
		bst.insert(30);
		bst.insert(50);
		bst.insert(45);
		bst.insert(48);
		
		
		System.out.println("print elements ");
		bst.print();
	}

}

package data_structure.ds_tree_binary;

public class BSTree {
	
	public class BTNode{
		int data;
		BTNode lChild;
		BTNode rChild;
	}
	
	private BTNode root;
	public BSTree(){
		root=null;
	}

	public void insert(int elem) {
		
		BTNode curr = root;
		BTNode prev = null;
		
		while (curr != null) {
			prev = curr;
			if(elem < curr.data) {
				curr=curr.lChild;
			}
			else
				curr=curr.rChild;
		}
		
		BTNode newNode=new BTNode();
		newNode.data=elem;
		newNode.lChild=null;
		newNode.rChild=null;
		
		if(prev == null) {
			root = newNode;
			return;
		}
		
		
		if(newNode.data < prev.data) {
			prev.lChild=newNode;
		}
		else
			prev.rChild=newNode;
	}
	
	
	
	public boolean find (int elem) {
		BTNode curr=root;
		while((curr != null) && (curr.data != elem)) {
			if(elem < curr.data) {
				curr=curr.lChild;
			}
			else {
				curr=curr.rChild;
			}
		}
			if(curr==null) {
				return false;
			}	
			return true;
		}
		
	

	
	
	public void inOrder(BTNode node) {
		if(node == null)
			return;
		
		if(node.lChild != null) {
			inOrder(node.lChild);
		}
		System.out.println(node.data);
		
		if(node.rChild != null) {
			inOrder(node.rChild);
		}
	}


	public void print() {
		inOrder(root);
	}
	

}

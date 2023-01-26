package data_structure.ds_tree_mosh;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }
    private Node root;

    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }

            else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }


    public void inOrder(Node node) {
        if(node == null) return;
        if(node.leftChild != null)
            inOrder(node.leftChild);//left
        System.out.print(node.value + " ");//root
        if(node.rightChild != null)
            inOrder(node.rightChild);//right
    }
    public void inOrder() {
        System.out.print("inOrder : ");
        inOrder(root);
        System.out.println();
    }

    public void preOrder(Node node) {
        if(node == null) return;
        System.out.print(node.value + " ");//root
        if(node.leftChild != null)
            preOrder(node.leftChild);//left
        if(node.rightChild != null)
            preOrder(node.rightChild);//right
    }
    public void preOrder() {
        System.out.print("preOrder : ");
        preOrder(root);
        System.out.println();
    }


    public void postOrder(Node node) {
        if(node == null) return;
        if(node.leftChild != null)
            postOrder(node.leftChild);//left
        if(node.rightChild != null)
            postOrder(node.rightChild);//right
        System.out.print(node.value + " ");//root
    }
    public void postOrder() {
        System.out.print("postOrder : ");
        postOrder(root);
        System.out.println();
    }

}


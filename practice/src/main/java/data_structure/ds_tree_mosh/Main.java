package data_structure.ds_tree_mosh;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        System.out.println( tree.find(7));

        tree.inOrder();
        tree.preOrder();
        tree.postOrder();

    }
}

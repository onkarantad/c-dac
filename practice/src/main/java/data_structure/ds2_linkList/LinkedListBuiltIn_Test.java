package data_structure.ds2_linkList;

import java.util.LinkedList;

public class LinkedListBuiltIn_Test {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(30);
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(20));
        System.out.println(list.size());
//        Arrays array = list.toArray();
//        System.out.println(Arrays.toString(array));
    }
}

package data_structure.ds1_array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        Array num = new Array(1);
        num.insert(1);num.insert(2);num.insert(3);num.insert(4);num.insert(5);
        num.removeAt(3);
        num.print();
        System.out.println("index : " + num.indexOf(6));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        System.out.println( "Contains : " + list.contains(20));
        System.out.println( "Size : " + list.size());
        System.out.println(list);
    }
}

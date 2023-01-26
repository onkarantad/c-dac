package collections.sort.comparable;

import java.util.*;

public class TestComparable {
    public static void main(String[] args) {


        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(3);
        numList.add(2);
        numList.add(5);
        numList.add(6);
        numList.add(6);
        numList.add(1);
        System.out.println("before Sort");
        numList.forEach(i-> System.out.println(i));
        Collections.sort(numList);
        System.out.println("After Sort");
        numList.forEach(i-> System.out.println(i));

        List<String> stringList = new ArrayList<>();
        stringList.add("c");
        stringList.add("e");
        stringList.add("b");
        stringList.add("d");
        stringList.add("a");
        System.out.println("before Sort");
        stringList.forEach(i-> System.out.println(i));
        Collections.sort(stringList);
        System.out.println("After Sort");
        stringList.forEach(i-> System.out.println(i));


        List<Emp> list = new ArrayList<>();
        list.add(new Emp(4,"b",20000));
        list.add(new Emp(6,"a",30000));
        list.add(new Emp(5,"d",60000));
        list.add(new Emp(1,"c",10000));
        list.add(new Emp(2,"e",40000));
        list.add(new Emp(3,"f",50000));


        System.out.println("direct");
        System.out.println(list);

//        System.out.println("Iterator");
//        Iterator<Emp> itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        System.out.println("forEach");
//        list.forEach(i->{
//            System.out.println(i);
//        });

        Collections.sort(list);
        System.out.println(list);


    }

}

package collections.sort.comprator;

import java.util.*;

public class TestComparable {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(4,"b",20000));
        list.add(new Emp(6,"a",30000));
        list.add(new Emp(5,"d",60000));
        list.add(new Emp(1,"c",10000));
        list.add(new Emp(2,"e",40000));
        list.add(new Emp(3,"f",50000));


        // PRINTING

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



    // SORTING

//            //using ComparatorImpl class
//        Comparator<Emp> comp = new ComparatorImpl();
//        Collections.sort(list,comp);




//          // anonymous  class
//        Comparator<Emp> com = new Comparator<Emp>() {
//            @Override
//            public int compare(Emp e1, Emp e2) {
//                return e1.getId()-e2.getId();
//            }
//        };
//        Collections.sort(list, com);




        // anonymous inner class
//        Collections.sort(list, new Comparator<Emp>() {
//            @Override
//            public int compare(Emp e1, Emp e2) {
//                return e1.getId()- e2.getId();
//            }
//        });



//         Lambda Expression
//        Collections.sort(list,(Emp e1, Emp e2) -> {
//            return e1.getId()- e2.getId();
//        });


        System.out.println(list);


    }

}

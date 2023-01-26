package stream;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<SchoolObj> listOne = new ArrayList<SchoolObj>();
        // TODO: Add sample data to listOne.
        listOne.add(new SchoolObj(101, 34));
        listOne.add(new SchoolObj(102, 43));
        listOne.add(new SchoolObj(103, 42));
        listOne.add(new SchoolObj(104, 45));

        List<SchoolObj> listTwo = new ArrayList<SchoolObj>();
        // TODO: Add sample data to listTwo.
        listTwo.add(new SchoolObj(101, 32));
        listTwo.add(new SchoolObj(102, 41));
        listTwo.add(new SchoolObj(103, 45));
        listTwo.add(new SchoolObj(104, 48));
        listTwo.add(new SchoolObj(105, 47));

        List<SchoolObj> a = listOne.stream().filter(one -> listTwo.stream()
                        .anyMatch(two -> two.getId()==one.getId()))
                .collect(Collectors.toList());
        System.out.println("a:" + a);

        List<List<Integer>> b = listOne.stream().map(one -> listTwo.stream().map(two -> two.getId()==one.getId() ? Math.max(one.getRent(), two.getRent()) : 0).collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println("b:" + b);

        List<Integer> c = listOne.stream().map(one -> listTwo.stream().filter(two -> two.getId()==one.getId()).map(two -> Math.max(two.getRent(), one.getRent())).collect(Collectors.toList()).get(0)).collect(Collectors.toList());
        System.out.println("c:" + c);

    }
}

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class SchoolObj {
    private int id;
    private int rent;

}

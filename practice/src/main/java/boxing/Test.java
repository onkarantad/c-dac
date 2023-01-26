package boxing;

public class Test {

    static  int a ;


    public static void main(String[] args) {

        Integer i1 = new Integer(100);  //boxing
        System.out.println("i1 : " + i1.intValue()); //unboxing
        System.out.println("i1 : " + i1); //autounboxing

        Integer i2 = 20; // auto boxing
        int i = i2; // auto unboxing
        System.out.println("i : " + i);

        System.out.println("Integer a : " + a);
    }
}

package stringbuffbuld;

public class TestEquals {
    public static void main(String[] args) {
        StringBuilder sd1 = new StringBuilder("hello");
        StringBuilder sd2 = new StringBuilder("hello");
        System.out.println("builder : == : " + (sd1==sd2));              // F
        System.out.println("builder : equals :  " + (sd1.equals(sd2)));  // F

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println("Buffer : == : " + (sb1==sb2));             // F
        System.out.println("Buffer : equals :  " + (sb1.equals(sb2))); // F

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println("String : == : " + (s1==s2));                //  F
        System.out.println("String : equals :  " + (s1.equals(s2)));    //  T

        System.out.println("builder capacity : " + sd1.capacity());
        System.out.println("builder capacity : " + sb1.capacity());
        sd1.trimToSize();
        System.out.println("builder capacity : " + sd1.capacity());
        sb1.trimToSize();
        System.out.println("builder capacity : " + sd1.capacity());

        sd1.delete(0,2);

    }
}

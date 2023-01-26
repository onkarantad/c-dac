package nestedclass;

public class Outer {
    private int o1;
    private static int o2;
    static {
        o2=100;
    }
    public Outer(int o1) {
        this.o1 = o1;
    }


    public static void show(){
//        System.out.println("o1" + o1);   // not accessable (o1 is not static)
        System.out.println("o1" + new Outer(111));
        //or
        Outer outer = new Outer(111);
        System.out.println("o1" + outer);

        System.out.println("o2 : " + o2); // accessable (o2 is static)


//        System.out.println("i1 : " + inner.i1); // not accessable (i1 is not static)
        System.out.println("i1 : " + outer.new Inner(234));
        //OR
        Outer.Inner inner= outer.new Inner(234);
        System.out.println("i1 : " + inner);

        System.out.println("i2 : " + inner.i2); // accessable (i2 is static)

    }
    public void display(){
        System.out.println("o1 : " + o1);
        System.out.println("o2 : " + o2);
        Inner i = new Inner(10);
        System.out.println("i1 : " + i.i1);
        System.out.println("i2 : " + Inner.i2);

    }



     class Inner{
        private int i1;
        //private static final int i2;
         // no static block
        private static final int i2=50;
        Inner(int i1){
            this.i1=i1;
        }

        public void showI(){
            System.out.println(i1 + i2 + o1 + o2);
        }
    }




    public static  void main(String[] args) {
        Outer o = new Outer(20);
        o.display();
        show();




    }

}

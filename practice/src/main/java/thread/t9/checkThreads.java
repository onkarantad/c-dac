package thread.t9;

class StringBuff{
    StringBuffer sb ;
    public  StringBuffer callingSb(){
        sb=new StringBuffer("stringBuff");
        return sb;
    }
}

class StringBuld{
    StringBuilder sd ;
    public StringBuilder callingSd(){
        sd=new StringBuilder("stringBuld");
        return sd;
    }
}

public class checkThreads {
    public static void main(String[] args) throws Exception {





        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                StringBuff sb = new StringBuff();

                for (int i=0 ; i<5 ; i++){
                    System.out.println("t1 : " + sb.callingSb() + i);
                    try { Thread.sleep(2000); }catch (Exception e){};
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                StringBuff sb = new StringBuff();
                for (int i=5 ; i<10 ; i++){
                    System.out.println("t2 : " + sb.callingSb() + i);
                    try { Thread.sleep(2000); }catch (Exception e){};
                }
            }
        });
        // t1 and t2 are string buffer (thread safe) //slow
        t1.start();
        t2.start();
        t1.join();
        t2.join();









//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                StringBuld sd = new StringBuld();
//                for (int i=0 ; i<5 ; i++){
//                    System.out.println("t3 : " + sd.callingSd() + i);
//                    try { Thread.sleep(2000); }catch (Exception e){};
//                }
//            }
//        });
//
//        Thread t4 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                StringBuld sd = new StringBuld();
//                for (int i=5 ; i<10 ; i++){
//                    System.out.println("t4 : " + sd.callingSd() + i);
//                    try { Thread.sleep(2000); }catch (Exception e){};
//                }
//            }
//        });
//
//        // t3 and t4 are string builder (thread unsafe) //fast
//        t3.start();
//        t4.start();
//        t3.join();
//        t4.join();




        System.out.println("bye");


    }
}

package thread.t4;

public class checkThreads {
    public static void main(String[] args) throws Exception{

        Runnable t1 = () -> {
                for (int i=0 ; i<5 ; i++){
                    System.out.println("first thrd executing");
                    try { Thread.sleep(500); }catch (Exception e){};
                }
            };

        Runnable t2 = () -> {
                for (int i=0 ; i<5 ; i++){
                    System.out.println("second thrd executing");
                    try { Thread.sleep(500); }catch (Exception e){};
                }
            };
        // One and Two implement Runnable  so
        // One and Two is not a thread so we have to create thread and pass its object to that thread
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);


        th1.start();
        try { Thread.sleep(10); }catch (Exception e){};
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Main thrd executing");
        // main thrd wont wait for other thread to stop and execute alongside with the other thrd
        // to make main thrd to wait join() method is used on other thrd so before the after
        // other thrd complete its execution main thrd will execute
        // join method is checked exception so we have to us e throws
    }
}

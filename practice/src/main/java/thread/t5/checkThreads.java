package thread.t5;



public class checkThreads {
    public static void main(String[] args) throws Exception{
        // One and Two implement Runnable  so
        // One and Two is not a thread so we have to create thread and pass its object to that thread

        Thread th1 = new Thread(() -> {
            for (int i=0 ; i<5 ; i++){
                System.out.println("first thrd executing");
                try { Thread.sleep(500); }catch (Exception e){};
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i=0 ; i<5 ; i++){
                System.out.println("second thrd executing");
                try { Thread.sleep(500); }catch (Exception e){};
            }
        });


        th1.start();
        try { Thread.sleep(10); }catch (Exception e){};
        th2.start();

        System.out.println("thread 1 isAlive :  " + th1.isAlive());
        System.out.println("thread 2 isAlive :  " + th2.isAlive());

        th1.join();
        th2.join();

        System.out.println("thread 1 isAlive :  " + th1.isAlive());
        System.out.println("thread 2 isAlive :  " + th2.isAlive());

        System.out.println("Main thrd executing");
        // main thrd wont wait for other thread to stop and execute alongside with the other thrd
        // to make main thrd to wait join() method is used on other thrd so before the after
        // other thrd complete its execution main thrd will execute
        // join method is checked exception so we have to us e throws
    }
}

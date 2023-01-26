package thread.t1;

class One extends Thread{
    // One is a thread
    public void run() {
        for (int i=0 ; i<5 ; i++){
            System.out.println("first thrd executing");
            try { Thread.sleep(500); }catch (Exception e){};
        }
    }
}

class Two extends Thread{
    // Two is a thread
    public void run() {
        for (int i=0 ; i<5 ; i++){
            System.out.println("second thrd executing");
            try { Thread.sleep(500); }catch (Exception e){};
        }
    }
}


public class checkThreads {
    public static void main(String[] args) throws Exception{
        One t1 = new One();
        Two t2 = new Two();
        // One and Two extend from Thread so it is (is a relationship)
        // One is a thread and Two is a thread
        // so reference t1 an t2 is also referring thread
        t1.start();
        try { Thread.sleep(10); }catch (Exception e){};
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thrd executing");
        // main thrd wont wait for other thread to stop and execute alongside with the other thrd
        // to make main thrd to wait , join() method is used on other thrd
        // after one,two thrd complete its execution main thrd will execute
        // sleep method is checked exception so we have to us e throws
    }
}

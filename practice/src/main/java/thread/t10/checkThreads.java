package thread.t10;

class CounterUnsafe{
    int count;
    public void increment(){
        count++;
    }
}


class CounterSafe{
    int count;
    public synchronized void  increment(){
        count++;
    }
}


public class checkThreads {
    public static void main(String[] args) throws Exception{

        CounterUnsafe cu = new CounterUnsafe();
        CounterSafe cs = new CounterSafe();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<1000 ; i++){
                    cu.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<1000 ; i++){
                    cu.increment();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<1000 ; i++){
                    cs.increment();
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<1000 ; i++){
                    cs.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("count unsafe thread : " + cu.count);
        System.out.println("count safe thread   : " + cs.count);

    }
}

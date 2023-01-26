package thread.t8;

class CounterUnsafe{
    int count;
    public void increment(){
        count++;
    }
}
// t1 and t2 will work on CounterUnsafe increment()
// method simultaneously and count will not reach till 2000

class CounterSafe{
    int count;
    public synchronized void  increment(){
        count++;
    }
}
// if t3 working on increment() of CounterSafe then t4 will wait and if t4 is working on increment()
// of CounterSafe then t3 will wait
// so counter will reach till 2000
// because of  synchronized keyword

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

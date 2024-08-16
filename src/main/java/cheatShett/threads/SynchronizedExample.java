package cheatShett.threads;

class Counter {
    int count;
  synchronized void increment() {
        count++;
    }
}
public class SynchronizedExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(()-> {
            for (int x =1; x<=1000;x++) {
                    counter.increment();
            }
        });

        Thread t2 = new Thread(()-> {
            for (int x =1; x<=1000;x++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}

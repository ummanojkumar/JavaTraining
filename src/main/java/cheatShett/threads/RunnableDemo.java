package cheatShett.threads;

class Hiis implements Runnable {

    public void run () {
       for (int x=1; x<=5; x++) {
           //we can cal the thread name inside method, which thread is executing
           System.out.println("Hii -> " + Thread.currentThread().getName());
         try {  Thread.sleep(500); } catch (Exception e) {}
       }
    }
}

class Hellos implements Runnable {
    public void run() {
        for (int x=1; x<=10; x++) {
            System.out.println("Hello");
            try {  Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
public class RunnableDemo {

    public static void main(String[] args) throws InterruptedException {
        Hiis hii = new Hiis();
        Hellos hello = new Hellos();

        Thread t1= new Thread(hii);
        Thread t2= new Thread(hello);

        //set name to threads
        t1.setName("thread 1");
        t2.setName("thread 2");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //set priority to threads from 0 to 10
        //priorities are platform dependent, it depends on which jvm and os
        //it is just a hint to jvm thread scheduler to take priority, order of execution is random only
        t1.setPriority(Thread.MAX_PRIORITY); //max = 10
        t2.setPriority(Thread.MIN_PRIORITY); //min = 1

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        //calling threading
        t1.start();
        try {  Thread.sleep(50); } catch (Exception e) {}
        t2.start();

        //main thread will wait until t1 thread completes
        t1.join();
        //main thread will wait until t1 thread completes
        t2.join();

        System.out.println("t1 thread status is : "+ t1.isAlive()); //return true if thread is running else false


        System.out.println("Main Thread is running");
    }
}

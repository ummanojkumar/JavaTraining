package cheatShett.threads;

public class ThreadsExample {

    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }

    static class MyRunnable implements Runnable {
        private static final Object lock = new Object();

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " has started.");

                // Simulate some task
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Notify other waiting threads
                lock.notify();

                // Wait for notification from other threads
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " has finished.");
            }
        }
    }

    /*
    Thread 1 has started.
    Thread 1 - 0
    Thread 1 - 1
    Thread 1 - 2
    Thread 1 - 3
    Thread 1 - 4
    Thread 2 has started.
    Thread 2 - 0
    Thread 2 - 1
    Thread 2 - 2
    Thread 2 - 3
    Thread 2 - 4
    Thread 1 has finished.
     */
}

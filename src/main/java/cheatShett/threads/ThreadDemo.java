package cheatShett.threads;

class Hii extends Thread {

    public void run () {
       for (int x=1; x<=5; x++) {
           System.out.println("Hii");
         try {  Thread.sleep(500); } catch (Exception e) {}
       }
    }
}

class Hello extends Thread {
    public void run() {
        for (int x=1; x<=5; x++) {
            System.out.println("Hello");
            try {  Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
public class ThreadDemo {

    public static void main(String[] args) {
        Hii hii = new Hii();
        Hello hello = new Hello();

        hii.start();
        try {  Thread.sleep(50); } catch (Exception e) {}
        hello.start();
    }
}

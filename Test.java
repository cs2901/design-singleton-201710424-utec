class MyThread implements Runnable {
    String name;
    Thread t;

    MyThread(String thread) {
        name = thread;
        t = new Thread(this, name);
        t.start();
        System.out.print(name + ":");
        ChocolateBoilerSingleton.getInstance();
    }

    public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " exiting.");
        }
    }

public class Test {
    public static void main(String[] args) {
        new MyThread("Two");
        new MyThread("Four");
        new MyThread("One");
        new MyThread("Three");
    }
}

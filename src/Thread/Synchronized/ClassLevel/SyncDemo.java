package Thread.Synchronized.ClassLevel;

public class SyncDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Steve");
        MyThread t2 = new MyThread("Tony");

        t1.start();
        t2.start();

    }
}

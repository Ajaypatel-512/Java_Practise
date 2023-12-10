package Thread.DeadLock;

public class DeadLockDemo implements Runnable{

    FirstResource fr = new FirstResource();
    SecondResource sr = new SecondResource();

    DeadLockDemo(){
        new Thread(this).start();
        sr.method1(fr);
    }

    public static void main(String[] args) {
        new DeadLockDemo();
    }

    @Override
    public void run() {
        fr.method1(sr);
    }
}
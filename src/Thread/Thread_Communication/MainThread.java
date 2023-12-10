package Thread.Thread_Communication;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread m1 = new MyThread();
        m1.start();

        synchronized (m1){
            System.out.println("Main Thread goining to wait");
            m1.wait();
            System.out.println("Main Thread Notified");
            System.out.println(m1.total);
        }
    }
}

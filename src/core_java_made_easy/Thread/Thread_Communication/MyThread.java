package core_java_made_easy.Thread.Thread_Communication;

public class MyThread extends Thread{
    int total;
    @Override
    public void run() {
        System.out.println("Child Thread is calculatiing sum");

        synchronized (this) {

            for (int i = 1; i < 10; i++) {
                total += i;
            }
            this.notify();
        }
    }
}

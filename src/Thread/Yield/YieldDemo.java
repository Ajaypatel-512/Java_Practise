package Thread.Yield;

public class YieldDemo extends Thread{
    @Override
    public void run() {
        for (int i= 1; i<200; i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

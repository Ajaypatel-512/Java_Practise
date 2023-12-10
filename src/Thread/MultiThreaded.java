package Thread;

public class MultiThreaded extends Thread{
    public static void main(String[] args) {

        MultiThreaded mt = new MultiThreaded();
        mt.setPriority(MIN_PRIORITY);
        mt.setName("mt");
        mt.start();
        Thread currentThread = Thread.currentThread();
        System.out.println("Thread Name: "+currentThread.getName());

        MultiThreaded mt1 = new MultiThreaded();
        mt1.setPriority(MAX_PRIORITY);
        mt1.setName("mt1");
        mt.start();
//        Thread currentThread = Thread.currentThread();
//        System.out.println("Thread Name: "+currentThread.getName());

        for (int j = 0; j<200; j++){
            System.out.print("j : "+j+"\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Parent Thread Executing");
            }
        }
    }

    public void run(){

        Thread currentThread = Thread.currentThread();
        System.out.println("Thread Name: "+currentThread.getName());
        currentThread.setName("Print 200 number");
        System.out.println("Thread Name: "+currentThread.getName());

        for (int i = 0; i<200; i++){
            System.out.print("i : "+i+"\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Executing");
            }
        }
    }
}

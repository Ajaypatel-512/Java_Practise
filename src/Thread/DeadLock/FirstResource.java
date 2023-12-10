package Thread.DeadLock;

public class FirstResource {
    public synchronized void method1(SecondResource sr){
        System.out.println("Inside Method1 of FR1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Invoking method2 of SR");
        sr.method2();
    }

    public synchronized void method2(){
        System.out.println("Inside Method2 of FR1");

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

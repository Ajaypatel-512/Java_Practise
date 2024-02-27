package core_java_made_easy.Thread.DeadLock;

public class SecondResource {

    public synchronized void method1(FirstResource fr){
        System.out.println("Inside Method1 of SR1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Invoking method2 of FR");
        fr.method2();
    }

    public synchronized void method2(){
        System.out.println("Inside Method2 of SR1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

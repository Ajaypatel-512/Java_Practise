package Thread.Yield;

public class Demo {
    public static void main(String[] args) {
        YieldDemo y = new YieldDemo();
        y.start();

        for (int i=1; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}

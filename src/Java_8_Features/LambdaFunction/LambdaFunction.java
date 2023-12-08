package Java_8_Features.LambdaFunction;

public class LambdaFunction {
    public static void main(String[] args) {
        display();
        mutiply(10,10);

        Sum s = (x,y)->{
            System.out.println("Sum is : "+(x+y));
        };

        s.add(10,10);

        Runnable r = new MyRunnableImpl();
        Thread t = new Thread();
        t.start();

        for (int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
//
//        Thread t = new Thread();
//        t.start();
        Runnable a = () ->{
            for (int i=0; i<=10; i++){
                System.out.println("Child Thread");
            }
        };

    }

    public static void display(){
        System.out.println("Ajay");
    }

//    Runnable ajay = () -> {
//        System.out.println("Ajay");
//    };

    public static void mutiply(int a,int b){
        System.out.println(a*b);
    }

//    (int a,int b) -> {
//        System.out.println(a*b);
//    };

    
}

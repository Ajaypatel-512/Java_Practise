package Java_8_Features.LambdaFunction;

public class LambdaFunction {
    public static void main(String[] args) {
        display();
        mutiply(10,10);



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

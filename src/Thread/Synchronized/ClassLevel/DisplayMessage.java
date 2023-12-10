package Thread.Synchronized.ClassLevel;

public class DisplayMessage {
    public static synchronized void sayHello(String name){
        for (int i= 0; i<10; i++){
            System.out.println("How are you : "+ name);
        }
    }
}

package core_java_made_easy.Thread.Synchronized;

public class DisplayMessage {
    public synchronized void sayHello(String name){
        for (int i= 0; i<10; i++){
            System.out.println("How are you : "+ name);
        }
    }
}

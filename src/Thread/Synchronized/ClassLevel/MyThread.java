package Thread.Synchronized.ClassLevel;

public class MyThread extends Thread{
    String name;
    MyThread( String name){
        this.name = name;
    }

    @Override
    public void run() {
        DisplayMessage.sayHello(name);
    }
}

package core_java_made_easy.Thread.Synchronized.Blocks;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;
    MyThread( DisplayMessage dm, String name){
        this.dm = dm;
        this.name = name;
    }

    @Override
    public void run() {
        dm.sayHello(name);
    }
}

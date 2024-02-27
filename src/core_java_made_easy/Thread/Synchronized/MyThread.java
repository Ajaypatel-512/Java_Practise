package core_java_made_easy.Thread.Synchronized;

public class MyThread extends Thread{
    DisplayMessage d1;
    String name;
    MyThread(DisplayMessage d,String name){
        this.d1 = d;
        this.name = name;
    }

    @Override
    public void run() {
        d1.sayHello(name);
    }
}

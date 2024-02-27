package core_java_made_easy.Thread.Synchronized.Blocks;

public class SyncDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread(dm,"Steve");
        MyThread t2 = new MyThread(dm,"Tony");

        t1.start();
        t2.start();

    }
}

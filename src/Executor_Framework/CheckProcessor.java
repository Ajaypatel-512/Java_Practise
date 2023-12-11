package Executor_Framework;

public class CheckProcessor implements Runnable{
    String name;

    public CheckProcessor(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "began processing" +Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + "completed processing" + Thread.currentThread().getName());

    }
}

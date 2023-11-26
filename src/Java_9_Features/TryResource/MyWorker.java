package Java_9_Features.TryResource;

public class MyWorker implements AutoCloseable{

    MyWorker(){
        System.out.println("Creating a resource");
    }

    public void doSomething(){
        System.out.println("Do Something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}

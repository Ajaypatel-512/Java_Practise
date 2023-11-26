package Java_9_Features.TryResource;

public class TestClass {
    public static void main(String[] args) {
        MyWorker myWorker = new MyWorker();

        try(myWorker) {
            myWorker.doSomething();
        }catch (Exception e){

        }
    }
}

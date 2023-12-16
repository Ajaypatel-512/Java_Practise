package Collections_Framework.ConcurrentCollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        BlockingQueue<String> objects = new ArrayBlockingQueue<>(1024);
        OrderProducer producer = new OrderProducer(objects);
        OrderConsumer consumer = new OrderConsumer(objects);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}

package core_java_made_easy.Collections_Framework.ConcurrentCollections;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

    private BlockingQueue<String> queue;

    OrderProducer(BlockingQueue<String> queue){
        this.queue = queue;
    }


    @Override
    public void run() {

        try {
            queue.put("Mac Laptop");
            queue.put("Dell");
            queue.put("Hp");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

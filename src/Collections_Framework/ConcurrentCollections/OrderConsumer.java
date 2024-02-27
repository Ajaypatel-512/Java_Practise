package Collections_Framework.ConcurrentCollections;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable{
    private BlockingQueue<String> queue;

    OrderConsumer(BlockingQueue<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
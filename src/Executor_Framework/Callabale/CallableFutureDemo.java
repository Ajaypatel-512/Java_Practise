package Executor_Framework.Callabale;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {
        MyCallable[] my = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50)
        };
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (MyCallable m: my) {
            Future<Integer> future = service.submit(m);

            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

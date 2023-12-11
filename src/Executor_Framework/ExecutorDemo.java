package Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        CheckProcessor[] cp = {new CheckProcessor("Atm "),new CheckProcessor("Bank "),new CheckProcessor("Mobile "),new CheckProcessor("Web ")};
        ExecutorService service = Executors.newFixedThreadPool(2);

        for (CheckProcessor cps:cp) {
            service.submit(cps);
        }

        service.shutdown();

    }
}

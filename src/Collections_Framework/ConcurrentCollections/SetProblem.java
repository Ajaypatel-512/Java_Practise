package Collections_Framework.ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetProblem extends Thread {

    static CopyOnWriteArraySet<String> courses1 = new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        courses1.add("kubernetes");
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> courses = new ArrayList<>();
        courses.add("python");
        courses.add("java");
        courses.add("deveops");
        courses.add("react");

        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
//            if (courses.equals("deveops")){
//                courses.remove(courses);
//            }
//            courses.add("Node");  // concurrent exception
        }


//        CopyOnWriteArrayList<String> courses1 = new CopyOnWriteArrayList<>();


        SetProblem arraysListProblem = new SetProblem();
        arraysListProblem.start();
        courses1.add("python");
        courses1.add("java");
        courses1.add("deveops");
        courses1.add("react");

        Iterator<String> iterator1 = courses1.iterator();
        while (iterator1.hasNext()){
            Thread.sleep(2000);
            String next = iterator1.next();
            System.out.println(next);
//            if (next.equals("deveops")){
//                courses.remove(next);
//            }
//            courses.add("Node");  // concurrent exception
        }
        System.out.println(courses1);


    }
}

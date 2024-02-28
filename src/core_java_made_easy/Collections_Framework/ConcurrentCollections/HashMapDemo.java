package core_java_made_easy.Collections_Framework.ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo extends Thread{

    static ConcurrentHashMap<String,String> courses1 = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        courses1.put("kubernetes","7.1");
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


        HashMapDemo arraysListProblem = new HashMapDemo();
        arraysListProblem.start();
        courses1.put("python","5");
        courses1.put("java","5.5");
        courses1.put("deveops","6.5");
        courses1.put("react","4.4");

        Iterator<String> iterator1 = courses1.keySet().iterator();
        while (iterator1.hasNext()){
            Thread.sleep(2000);
            String next = iterator1.next();
            System.out.println(courses1.get(next));
//            if (next.equals("deveops")){
//                courses.remove(next);
//            }
//            courses.add("Node");  // concurrent exception
        }
        System.out.println(courses1);


    }
}

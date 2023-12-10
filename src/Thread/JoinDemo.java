package Thread;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int num = 0,sum=0;
    public static void main(String[] args) {
        System.out.println("Sum of first n number");
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        JoinDemo.num = sc.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();
        try {
            jd.join();
        } catch (InterruptedException e) {

        }

        System.out.println("Sum of :"+JoinDemo.num + " is : "+JoinDemo.sum);
    }
    public void run(){
        for (int i=1; i<=JoinDemo.num; i++){
            JoinDemo.sum += i;
        }
    }
}

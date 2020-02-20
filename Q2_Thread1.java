package Multithreading;/*

Created by 
bharat 
on 19/02/20 
*/
class Runner1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside thread classs in runnable "+ i);

        }

    }
}

class Runner extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside thread classs "+ i);

        }

    }
}

public class Q2_Thread1 {
    public static void main(String[] args) {
        Runner r=new Runner();
        r.start();
        Thread t=new Thread(new Runner1());
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Inside thread classs in anoymous  "+ i);

                }

            }
        });
        t1.start();
        t.start();

    }
}

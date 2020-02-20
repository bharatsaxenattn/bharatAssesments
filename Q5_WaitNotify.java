package Multithreading;/* 

Created by 
bharat 
on 20/02/20 
*/

public class Q5_WaitNotify extends Thread  {
    public static void main(String[] args) {
        ThreadB t=new ThreadB();
        t.start();

        synchronized (t)
        {
            System.out.println("waiting for thread to complete");
            try {
                t.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(t.count);



    }

}
class ThreadB extends Thread
{
    int count=0;
    public void run()
    {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                count++;

            }
            notify();
        }
    }
}

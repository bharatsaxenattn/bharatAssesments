package Multithreading;/* 

Created by 
bharat 
on 20/02/20 
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q4_OddEven {

    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(2);
            executor.submit(new OddThread());
            executor.submit(new EvenThread());
            executor.shutdownNow();


      /*  EvenThread t1= new EvenThread();
        OddThread t2= new OddThread();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();

       */
    }

}

class EvenThread implements Runnable{


    @Override
    public synchronized void run() {

            for(int i=1;i<=10;i++){
                if(i%2==0){
                    System.out.println("even number "+i);

                }

            }
            notify();

        }
    }


class OddThread implements Runnable{



    @Override
    public synchronized void run() {

            for(int i=1;i<=10;i++){

                if(i%2==1){
                    System.out.println("odd number "+i);
                }
                notify();
            }
        }
    }


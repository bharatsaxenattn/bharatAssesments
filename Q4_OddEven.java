package Multithreading;/* 

Created by 
bharat 
on 20/02/20 
*/

public class Q4_OddEven {

    public static void main(String[] args){

        EvenThread t1= new EvenThread();
        OddThread t2= new OddThread();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }

}

class EvenThread implements Runnable{


    @Override
    public synchronized void run() {

            for(int i=1;i<=10;i++){
                if(i%2==0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("even number "+i);

                }

            }

        }
    }


class OddThread implements Runnable{



    @Override
    public synchronized void run() {

            for(int i=1;i<=10;i++){

                if(i%2==1){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("odd number "+i);
                }
                notify();
            }
        }
    }


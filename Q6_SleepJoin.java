package Multithreading;/* 

Created by 
bharat 
on 20/02/20 
*/
class Q6_SleepJoin extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Q6_SleepJoin t1=new Q6_SleepJoin();
        Q6_SleepJoin t2=new Q6_SleepJoin();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}

        t2.start();

    }
}

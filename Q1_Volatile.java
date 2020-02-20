package Multithreading;/*

Created by 
bharat 
on 20/02/20 
*/

 class VolatileData
{
    private volatile int count = 0;
    public int getCount()
    {
        return count++  ;
    }
    public void increment()
    {
        count++;      //increases the value of counter by 1
    }
}
public class Q1_Volatile extends Thread {

    private final VolatileData data;
    public Q1_Volatile(VolatileData data)
    {
        this.data = data;
    }
    @Override
    public void run()
    {
        for (int i = 0; i <3 ; i++) {


            int oldValue = data.getCount();
            System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
            data.increment();
            int newValue = data.getCount();
            System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
        }
    }

    public static void main(String[] args) {
        VolatileData volatileData=new VolatileData();
        Q1_Volatile q1_volatile=new Q1_Volatile(volatileData);
        Q1_Volatile q1_volatile1=new Q1_Volatile(volatileData);
        q1_volatile.start();
        q1_volatile1.start();
    }
}

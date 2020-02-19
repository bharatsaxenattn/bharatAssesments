package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

import java.util.Scanner;

public class Q_7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the seconds");
        int second=sc.nextInt();
        System.out.println("in minutes : "+toMinute(second));
        System.out.println("in hours : "+toHour(second));
        System.out.println("in days : "+toDay(second));

    }

    private static float toDay(int second) {
        float hour=toHour(second);
        return  hour/24;

    }

    private static float toHour(int second) {
         float min=toMinute(second);
         float hour=min/60;
         return  hour;
    }

    private static float toMinute(int second) {

        float min=second/60f;
        return min;



    }

}

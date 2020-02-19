package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

import java.util.Scanner;

public class Q8_KeyboardPress {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a;

        /*using do while loop*/
        do{
            System.out.println("enter the string");
            a=sc.nextLine();
            if(!a.equals("done")) {
                if (a.charAt(0) == a.charAt(a.length() - 1)) {
                    System.out.println("first and last character are same");
                    break;

                } else {
                    System.out.println("first and last character  are not same");
                }
            }
        }
        while(!a.equals("done"));


        //using while loop
        System.out.println("using while loop");
        System.out.println("enter the String");
        a=sc.nextLine();
        while(!a.equals("done"))
        {
            if (a.charAt(0) == a.charAt(a.length() - 1))
            {
                System.out.println("first and last character are same");
                break;
            } else {
                System.out.println("first and last character  are not same");
            }
            System.out.println("enter the String");
            a=sc.nextLine();
        }


    }
}

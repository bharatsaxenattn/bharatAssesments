package Demo;

/*

Created by
bharat
on 17/02/20
*/

import java.util.Scanner;

public class ReverseString {

    /* ans no 8*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter string of");
        String a=sc.nextLine();
        StringBuffer stringBuffer=new StringBuffer(a);
        StringBuffer reverse=stringBuffer.reverse();
        System.out.println(reverse);
        StringBuffer sb=reverse.replace(4,9,"");
        System.out.println(sb);
    }
}

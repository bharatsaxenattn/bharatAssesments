package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

import java.util.Scanner;

public class Q2_SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();
        char temp=0;
        char[] charArray = a.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            for (int i1 = 0; i1 < charArray.length; i1++) {
                if(charArray[i1]>charArray[i])
                {
                    temp=charArray[i];
                    charArray[i]=charArray[i1];
                    charArray[i1]=temp;
                }

            }

        }

       // String sortedString=charArray.toString();

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);

        }

    }
}
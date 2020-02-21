package Collection;/* 

Created by 
bharat 
on 21/02/20 
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2_UniqueCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.nextLine();

        uniqueCharacter(a);
    }

    private static void uniqueCharacter(String a) {
        String[] s=a.split("");

        Set<String> set=new HashSet<String>(Arrays.asList(s));
        set.remove(" ");
        System.out.println("number of unique character in String "+set.size());

    }
}

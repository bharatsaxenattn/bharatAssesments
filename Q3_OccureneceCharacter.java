package Collection;/* 

Created by 
bharat 
on 21/02/20 
*/

import java.util.*;

public class Q3_OccureneceCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.nextLine();

        frequencyCharacter(a);
    }

    private static void frequencyCharacter(String a) {
        String ar[]=a.split("");
        List<String> al=new ArrayList<>(Arrays.asList(ar));
        Set<String> set=new HashSet<>(Arrays.asList(ar));
        Iterator<String> iterator=set.iterator();

        while (iterator.hasNext())
        {
            String next=iterator.next();
            if(!next.equals(" ")) {
                int freq = Collections.frequency(al, next);
                System.out.println(next + " : " + freq);
            }
        }


    }
}

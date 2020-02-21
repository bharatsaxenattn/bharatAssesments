package Collection;/* 

Created by 
bharat 
on 21/02/20 
*/

import java.util.*;

public class Q1_List {

    public static void main(String[] args) {

        Q1_List a=new Q1_List();
        Scanner sc=new Scanner(System.in);
        List<Float> al=new ArrayList<>();
        System.out.println("enter elements");
        for (int i = 0; i <5 ; i++) {
            al.add(sc.nextFloat());
        }
        Iterator<Float> iterator=al.iterator();
        float sum=0f;
        while (iterator.hasNext())
        {
            sum=sum+iterator.next();
        }
        System.out.println("sum == "+sum);
    }
}

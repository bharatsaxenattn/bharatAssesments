package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

public class Q_11Loop {
    public static void main(String[] args) {
        int s=0;
        int t=1;
        int i=0;
        while(i<10)
        {
            s=s+i;
            int j=i;
            while(j>0)
            {
                t=t*(j-i);
                j=j-1;
            }
           i=i+1;
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);



    }
}

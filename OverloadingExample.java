package Demo;

/*

Created by
bharat
on 17/02/20
*/

public class OverloadingExample {

    // Ans no 10
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void add(double a,double b)
    {
        System.out.println(a+b);
    }


    public static void multiply(int a,int b)
    {
        System.out.println(a*b);
    }
    public static void multiply(float a,float b)
    {
        System.out.println(a*b);
    }

    public static void concat(String a,String b)
    {
        System.out.println(a+b);
    }

    public static void concat(String a,String b,String c)
    {
        System.out.println(a+b+c);
    }




    public static void main(String[] args) {
        add(1,2);
        add(1.22d,1.44d);
        multiply(2,3);
        multiply(2.1f,2.2f);
        concat("hello","world");

        concat("hello","world","again");



    }
}

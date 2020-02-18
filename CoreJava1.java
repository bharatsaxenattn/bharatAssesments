package Demo;

/*

Created by
bharat
on 17/02/20
*/

public class CoreJava1 {
    static String name="bharat";
    static String lastName="saxena";
    static int age=22;

    // Ans. 7

    static{
        //using static block
        System.out.println("inside static block");
        System.out.println("Name = Bharat" +" last name = saxena "+ "age = 22" );

    }
    public static void printMethod(String name,String last_name ,int age)
    {
        System.out.println("inside static method");
        System.out.println("Name = "+name +" last name = "+last_name+ "age = "+age );
    }

    public static void main(String[] args) {
        printMethod("bharat","saxena",22);
        System.out.println("using static variable");

        System.out.println("Name = "+name +" last name = "+lastName+ "age = "+age );



    }
}

package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

public class Q_6 {
    public static void main(String[] args) {

        try{
          //  int x=10/0;
            int ar[]={1,2,3,4};
            int a=ar[5];
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block executed");
        }


    }
}

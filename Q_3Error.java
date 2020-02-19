package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

public class Q_3Error {
    public static void main(String[] args) {
        try{
            Class.forName("Hello World");

        }
        catch (ClassNotFoundException e)
        {
          e.printStackTrace();
        }




    }
}

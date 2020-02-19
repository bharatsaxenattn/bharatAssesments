package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

class Singleton
{
    private static Singleton instance=null;
    public String s;

    // private constructor restricted to this class itself
    private Singleton()
    {
        s = "singeleton class";
    }

    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        // To ensure only one instance is created
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        System.out.println(x);
    }
}

package Demo;

/*super class*/
class Bank{

    /* Ans no . 11*/
    public void getDetails(double r,String a)
    {
        System.out.println("rate of interest is "+r+"%");
        System.out.println("Main Branch is in "+a);
    }
}

/*child class SBI*/
class SBI extends Bank{
    public void getDetails(double r,String a)
    {
        System.out.println("Welcome to sbi bank");
        System.out.println("rate of interest is "+r+"%");
        System.out.println("Main Branch is in "+a);
        System.out.println("----------------");

    }
}

/*child class ICICI*/
class ICICI extends Bank{
   public  void getDetails(double r,String a)
    {
        System.out.println("Welcome to ICICI");
        System.out.println("rate of interest is "+r+"%");
        System.out.println("Main Branch is in "+a);
        System.out.println("----------------");
    }
}

/*Child class BOI*/
class BOI extends Bank{
     public void getDetails(double r,String a)
    {
        System.out.println("Welcome to BOI");
        System.out.println("rate of interest is "+r+"%");
        System.out.println("Main Branch is in "+a);
        System.out.println("----------------");
    }
}

class MethodOverriding{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        BOI b=new BOI();
        s.getDetails(10,"Mumbai");
       i.getDetails(11,"delhi");
       b.getDetails(9,"Bangalore");
    }
}
package Java2;/* 

Created by 
bharat 
on 18/02/20 
*/

public class Q5_Clone implements Cloneable {

    int emp_id;
    String name;
    Q5_Clone(int id, String name)
    {
        this.name=name;
        this.emp_id=id;
    }
    Q5_Clone(Q5_Clone q5Clone)
    {
        this.name= q5Clone.name+" Saxena";
        this.emp_id= q5Clone.emp_id+1;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    public static void main(String[] args) {
       Q5_Clone c=new Q5_Clone(1,"bharat");
        try{
            /*using cloneable class*/

            Q5_Clone c1=(Q5_Clone)c.clone();
            System.out.println("emp_id : " +c1.emp_id+" name : "+c1.name);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        /* using copy constructor*/
        Q5_Clone q5Clone =new Q5_Clone(c);
        System.out.println("emp_id : " + q5Clone.emp_id+" name : "+ q5Clone.name);
    }

}

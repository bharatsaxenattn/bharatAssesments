package Demo;

/*

Created by
bharat
on 17/02/20
*/

public enum House {

    //Ans No. 9

    house1(10),house2(11),house3(12),house4(13),house5(14);
    private int price;

    House(int price)
    {
        this.price=price;
    }

    int getPrice(){
        return price;
    }

}
 class Enum{
    public static void main(String[] args) {
       // System.out.println("Houses price are: ");
        for (House h:House.values()) {
            System.out.println(h +" cost is :"+h.getPrice());

        }

    }
}

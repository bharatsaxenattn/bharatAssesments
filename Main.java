package Java2.Q1_Library;/* 

Created by 
bharat 
on 19/02/20 
*/

import java.util.Scanner;

public class Main implements Library {
    GetBookDetail getBookDetail;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        while (true) {
        System.out.println("Library managent system");


        System.out.println("1. Add books");
        System.out.println("2. Display book info");
        System.out.println("press the key to continue");
        int n = sc.nextInt();
        sc.nextLine();

            switch (n) {
                case 1:
                    // sc.next();
                    System.out.println("please enter book id");
                    String id = sc.nextLine();
                    System.out.println("please enter book name");
                    String name = sc.nextLine();
                    System.out.println("please enter book author");
                    String author = sc.nextLine();
                    System.out.println("please enter book publisher");
                    String publisher = sc.nextLine();
                    GetBookDetail getBookDetail = new GetBookDetail(id, name, author, publisher);
                    m.addBook(getBookDetail);
                    System.out.println("Book added sucessfully");
                    break;
                case 2:
                    m.showBookinfo();
                    break;
                default:
                    break;
            }

        }
    }

    @Override
    public boolean addBook(GetBookDetail detail) {
        getBookDetail=detail;

        return true;
    }

    @Override
    public boolean showBookinfo() {
        System.out.println("Book id :" +getBookDetail.getBookID());
        System.out.println("Book Name :"+getBookDetail.getTitle());
        System.out.println("Book author :"+getBookDetail.getAuthor());
        System.out.println("Book Publisher :"+getBookDetail.getPublisher());
        return true;
    }
}

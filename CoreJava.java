package Demo;

/*

Created by
bharat
on 17/02/20
*/

import java.util.*;
public class CoreJava {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while(flag) {
            System.out.println("Press key questions wise");
            System.out.println("1. Write a program to replace a substring inside a string with other string ?");
            System.out.println("2. Write a program to find the number of occurrences of the duplicate words in a string and print them ");
            System.out.println("3. Write a program to find the number of occurrences of a character in a string without using loop");
            System.out.println("4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String");
            System.out.println("5 . Find common elements between two arrays.");
            System.out.println("6. There is an array with every element repeated twice except one. Find that element");
            System.out.println("7. press 0 to exit");

            /*taking input from user question wise*/
            int n=sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    /* for question no 1.*/
                    System.out.println("please enter the string");
                    String a = sc.nextLine();
                    System.out.println("please enter the sub string you want to replace");
                    String b = sc.nextLine();
                    System.out.println("please enter the repaced string");
                    String c = sc.nextLine();

                    /* method call to replace the substring*/
                    replaceString(a, b, c);
                    break;

                case 2:
                    System.out.println("enter the String");
                    String n1 = sc.nextLine();
                    /* method call to find duplicates*/
                    findDuplicates(n1);
                    break;

                case 3:
                    System.out.println("please enter the string");
                    String a3 = sc.nextLine();
                    System.out.println("please enter the character you want to search the occurence ");
                    char character = sc.next().charAt(0);

                    /*method call to find count of a character*/
                    wordcount(a3, character);
                    break;

                case 4:
                    System.out.println("please enter the string");
                    String a4 = sc.nextLine();
                    /*method call to find percentage of lower case,upper,digit and special number*/
                    findPercentage(a4);
                    break;

                case 5:
                    System.out.println(" enter the number of elements ");
                    //input array size
                    int n5 = sc.nextInt();
                    int arr[] = new int[n5];
                    int arr1[] = new int[n5];
                    System.out.println("enter the elements in first array");
                    /*take input from user in array*/
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("enter the elements in second array ");
                    /*take input from user in array*/
                    for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = sc.nextInt();

                    }

                    /*method call to calculate common element*/
                    calculateCommonElements(arr, arr1);
                    break;

                case 6:
                    System.out.println("enter the number of elements in an array");
                    int n6 = sc.nextInt();
                    int arr6[] = new int[n6];
                    System.out.println("Enter the elements");
                    for (int i = 0; i < arr6.length; i++) {
                        arr6[i] = sc.nextInt();
                    }

                    /*method call to find single occurence element*/
                    findSingleOccurenceElement(arr6);
                    break;
                case 0:
                    flag=false;
                    System.exit(0);
                    break;


                default:
                    System.out.println("Please press valid number"+"\n");
                    break;


            }
        }
    }


    /*
    Q.6
    method to calculate single occurence element
    */
    private static void findSingleOccurenceElement(int[] arr6) {
        int element=arr6[0];
        for (int i = 1; i < arr6.length; i++) {

             element=element ^ arr6[i];
          //  System.out.println(arr6[i]);
        }
        System.out.println("Element occured one time is " +element);
    }

    /*
    Q.5
    *  find common elements between two array
    * */
    private static void calculateCommonElements(int[] arr, int[] arr1) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.print("Common word");
                    System.out.println(arr[i]);
                }
            }
        }
    }


    /* Q.4
    *
    * find percentage of uppercase,lower case,digit and special character in string
    * */
    private static void findPercentage(String a4)
    {

        int lower=0,upper=0,number=0,special=0;
        for(int i=0;i<a4.length();i++)
        {
            if(Character.isUpperCase(a4.charAt(i)))
            {
                upper++;
            }
            else if(Character.isLowerCase(a4.charAt(i)))
            {
                lower++;
            }
           else if(Character.isDigit(a4.charAt(i)))
            {
                number++;
            }
            else
            {
                if(a4.charAt(i)!=' ')
                special++;
            }

        }
        int l=a4.length();
        float upper_percentage=((float)upper/l)*100;
        System.out.println("number of upper case letter are :"+upper+" and percentage is : "+upper_percentage+"%");

        float lower_percentage=((float)lower/l)*100;
        System.out.println("number of lower case letter are : "+lower+" and percentage is : "+lower_percentage+"%");

        float digit_percentage=((float)number/l)*100;
        System.out.println("number of digits  are : "+number+" and percentage is : "+digit_percentage+"%");

        float special_percentage=((float)special/l)*100;
        System.out.println("number of special character letter are : "+special+" and percentage is : "+special_percentage+"%");

    }

    /*Q.3
    *  fiind count of a character in a string without using loop
    * */

    private static void wordcount(String a3, char character) {
        int count = a3.length() - a3.replace(character+"", "").length();
        System.out.println("Number of occurances of "+character+ " in "+a3 +" is "+count);

    }

/*Q.2
* find duplicate words in a string
* */
    private static void findDuplicates(String string)
    {

        String words[] = string.split(" ");
        int count=0;
        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++)
        {
            count = 1;
            for(int j = i+1; j < words.length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]+ " : "+count);
        }
    }


/*Q. 1
*  for replacing the string with other string
* */
    private static void replaceString(String a,String b,String c) {
        String replace=a.replace(b,c);
        System.out.println("new String is:"+"\n"+replace);
    }
}

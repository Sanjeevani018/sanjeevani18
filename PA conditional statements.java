import java.util.*;
public class javabasics{
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();
      if (num>0){
        System.out.println("Number is positive.");
      }else{
        System.out.println("Number is negative");
      }
    }
}



/*Finish the following code so that it prints You have a fever if your temperature is above 100
 and otherwise prints You don't have a fever*/


 /*import java.util.*;
 public class javabasics{
     public static void main(String args[]){
     double temp = 103.5;
 
     if(temp>100){
         System.out.println("You have fever go to doctor");
     }else{
         System.out.println("You don't have fever you are ok:) ");
     }
     }
 }*/


 /*Write a Java program to input week number(1-7) and print 
day of week name using switch case


import java.util.*;
public class javabasics{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the week number : ");
    int w_num = sc.nextInt();

    switch(w_num){
        case 1 : System.out.println("Its MONDAY");
                 break;
        case 2 : System.out.println("Its TUESDAY");
                  break;
        case 3 : System.out.println("Its WEDNESDAY");
                  break;           
        case 4 : System.out.println("Its THURSDAY");
                  break;
        case 5 : System.out.println("Its FRIDAY");
                  break;
        case 6 : System.out.println("Its SATURDAY");
                  break;
        case 7 : System.out.println("Its SUNDAY");
                  break;
        default: System.out.println("Wrong number");
    }
    }
}*/



/*Write a Java program that takes a year from the user and print 
whether that year is a leap year or not.


import java.util.*;
public class javabasics{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the year");
    int year = sc.nextInt();

    boolean x =(year % 4)==0;
    boolean y =(year % 100) !=0;
    boolean z =((year % 100 ==0 ) && (year % 400 == 0));

    if(x && (y||z)){
        System.out.println(year + " is a leap year");
    }else{
        System.out.println(year+" is not a leap year");
    }
    }
} */


package Num2;

import java.util.Scanner;

public class Primenumber 
{

   // static Scanner object
   static Scanner input = new Scanner(System.in);

   /* A prime number
   */ 
   static void isPrime() 
   {

       System.out.println("Enter a number of your choice to check if it is prime or not: ");
       var XY = input.nextInt();

       boolean A = false;
       for (int i = 2; i <= XY / 2; ++i) {
           
           if (XY % i == 0) {
               A = true;
               break;
               // condition for nonprime number
           }
       }

       if (!A)
           System.out.println(XY + " It is a prime number.");
       else
           System.out.println(XY+ " It is not a prime number.");

   }

   public static void main(String[] args)
    { // [main] method that displays prime numbers between 1 to 500.

       int A1= 0;
       int A2 = 0;
       // Empty String
       String Prime = "";

       for (A1 = 1; A1 <= 500; A1++) {
           int count = 0;
           for (A2 = A1; A2 >= 1; A2--) {
               if (A1 % A2 == 0) {
                   count = count + 1;
               }
           }
           if (count == 2) {
               // Appended the Prime number to the String
               Prime = Prime + A1 + " ";
           }
       }
       System.out.println("The prime numbers from 1 to 500 are :");
       System.out.println(Prime);

       // call the isPrime method in the main method
       isPrime();
   }
}

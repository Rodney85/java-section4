package Num1;

import java.util.Arrays; 
import java.util.Scanner; 

public class Array 
{
static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {

       // CREATE ARRAY AND PUT IT TO EMPTY.
       int[] X = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

       // Collect data from the user
       System.out.println("\nEnter 15 numbers to our array by spacing.)");
       X[0] = input.nextInt(); 
       X[1] = input.nextInt();
       X[2] = input.nextInt();
       X[3] = input.nextInt();
       X[4] = input.nextInt();
       X[5] = input.nextInt();
       X[6] = input.nextInt();
       X[7] = input.nextInt();
       X[8] = input.nextInt();
       X[9] = input.nextInt();
       X[10] = input.nextInt();
       X[11] = input.nextInt();
       X[12] = input.nextInt();
       X[13] = input.nextInt();
       X[14] = input.nextInt(); 

       
       var List = Arrays.toString(X);
        // convert the array to a string list

       // display the array to the user as a list.
       System.out.println("Our array has the following values: " + List);
      

       System.out.println("Enter any number to check if it is in the array: ");
       var ArInput = input.nextInt();

       check(X, ArInput);

   }

   private static void check(int[] arr, int Checkvalue) {

       
       boolean test = false;
       for (int A: arr) {

           
           // is present in the array or not
           if (A == Checkvalue) {
               test = true;
               break;
           }

       }

       // Print the result
       if (test) {
           System.out.println(Checkvalue + " is in the array.");
       } else {
           System.out.println(Checkvalue + " is not in the array.");
       }

   }
}


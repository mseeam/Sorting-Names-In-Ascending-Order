/**
* The program simply asks the user to enter three names and then displays the names sorted in ascending order.
* @author Mohammad Seeam
*/

//Below libraries will be used for taking input and showing output
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Three_Names{

    /* 
        Below is main function. 
        We call taking_input() from main function
    */

    public static void main(String[] args){
        taking_input();
    }

    /* 
        Below is taking_input function. 
        We call sorting() from taking_input function
    */

    public static void taking_input(){

        //We use the s object for taking input from user
        //System.in is a standard input stream  

        Scanner s = new Scanner(System.in); 

        //We creat an array of string to store names. The size of the array is 3
        String[] names_array = new String[3];

        //We use string_for_name to store string input value from user
        String string_for_name;

        //Below for loop takes input 3 times.
        for (int i=0;i<=2;i++){
            System.out.print("Please enter name: " ); 
            string_for_name = s.nextLine(); 

            //Store names in the array
            names_array[i]=string_for_name;
        }

        //Calling sorting() function and passing names_array.
        //We wil do the sorting in sorting() function.

        sorting(names_array);

    }

    /* 
        Below is sorting function. 
        The sorting() sorts the array of string and prints elements of it
    */

    public static void sorting(String[] names_array){
        // Sorting the strings
        Arrays.sort(names_array);
        //Printing names. Names will get printed sorted in ascending order.
        for(int i=0;i<=2;i++){
            System.out.print(names_array[i]+'\n'); 
        }
    }



}
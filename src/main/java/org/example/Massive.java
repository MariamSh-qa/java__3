package org.example;

public class Massive {
    static void main(String[] args) {

        int [] ages = {2, 4, 8}; //This is Massive. without this we can not print few numbers at the same time.

        System.out.println(ages[2]); //print which one is second in a row, Counting starting from 0.
        System.out.println(ages.length); //prints how much elements are inside the Array.

        for (int i=0; i<ages.length; i++) {
            System.out.println(ages[i]);  // Prints all elements of the array one by one using a for loop.
        }


        int [] ages1 = new int[5];
        for (int i =0; i<ages1.length; i++){
            System.out.println(ages1[i]);
        }



        String [] names = {"Mariami", "nino", "ana"};
        System.out.println(names[1]); // prints nino
        names[1] = "Lela";            // changes nino to lela
        System.out.println(names[1]); // prints lela


        //Creating an integer array with four numbers.
        int [] numbers = {20, 10, 0, -1000};
            //Using a for loop to print all elements of the array one by one.
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }







    }
}

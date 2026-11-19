package org.example;

public class MassiveBoolean {
    static void main(String[] args) {


        // Creating a boolean array with 5 elements.
        //Java automatically initializes all boolean array elements to false.
        boolean [] array = new boolean[5];
        // Using a for loop to go through all array elements.
        for (int i=0; i< array.length; i++){
            // Printing each element. All elements are false by default.
            System.out.println(array[i]);
        }




        // Creating a boolean array with 5 elements.
       // All elements are false by default.
        boolean [] array1 = new boolean[5];
        // Using a for loop to go through all array indexes.
        for (int i=0; i< array1.length; i++){
            // Checking if the current index is even (divisible by 2).
            if (i % 2 == 0)
                // If the index is even, changing its value to true.
                array1 [i] = true;
            // Printing the current element of the array.
            System.out.println(array1[i]);
        }



    }
}

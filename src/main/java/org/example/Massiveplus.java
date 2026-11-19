package org.example;

public class Massiveplus {
    static void main(String[] args) {


        int [] array = {3, 7, 2};
        int sum = 0;

        for (int i=0; i< array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);




        int [] array1 = {3, 7, 2, 4, 8};
        int count = 0;
        for (int i=0; i< array1.length; i++){
            if (array1[i] % 2 ==0 & array1[i] !=0)
                count++;
        }
        System.out.println("Even Numbers quantity is: " +count);




    }
}

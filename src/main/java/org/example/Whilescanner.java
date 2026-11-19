package org.example;

import java.util.Scanner;

public class Whilescanner {
    static void main(String[] args) {

        System.out.println("Enter any number, if you will enter 0 process will finish");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        while (number !=0 ){
            System.out.println("You entered: " + number);
            number = scanner.nextInt();
        }

        System.out.println("You entered 0 and process finished.");
        scanner.close();


    }
}

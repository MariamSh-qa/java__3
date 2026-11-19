package org.example;

public class MainFor {
    static void main() {

        //How to print TWICE. Starting from 0.
        for (int i=0; i<2; i++) {
            System.out.println("House");
        }

        //Wil print Twice, because <=
        for (int i=0; i<=1; i++){
            System.out.println("School");
        }

        for (int i=1; i<=4; i++){
            System.out.println(i);
        }
        System.out.println("finish");

        //Only EVEN numbers.
        for (int i =2; i<=10; i=i+2){
            System.out.println(i);
        }

        //Decrement
        for (int i =5; i>=2; i--){
            System.out.println(i);
        }

    }
}

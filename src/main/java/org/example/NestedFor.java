package org.example;

public class NestedFor {
    static void main(String[] args) {

        for (int i=0; i<3; i++){
            System.out.println("i is: " + i );
            for (int j=0; j<5; j++){
                System.out.println("    i is " +j);
            }
        }
    }
}

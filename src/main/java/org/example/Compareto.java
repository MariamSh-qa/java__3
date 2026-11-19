package org.example;

public class Compareto {
    static void main(String[] args) {

        //Compareto
        String text4 = "Apple";
        String text5 = "Banana";
        String text6 = "Apple";

        System.out.println(text4.compareTo(text5)); // Negative result means the first String comes before the second.
        System.out.println(text5.compareTo(text4)); // Positive result means the first String comes after the second.
        System.out.println(text4.compareTo(text6)); // 0 means both Strings are equal.


    }
}

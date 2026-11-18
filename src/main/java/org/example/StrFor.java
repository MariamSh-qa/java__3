package org.example;

public class StrFor {
    static void main(String[] args) {

        String text = "Test";

        //Length - Printing same amount how much letters we have.
        for (int i =0; i<text.length(); i++)
            System.out.println(text);


        //charAt - print all letters separately.
        for (int i=0; i<text.length(); i++)
            System.out.println(text.charAt(i));

        //Length - counting starting from 1.
        //position - starting from 0.



    }
}

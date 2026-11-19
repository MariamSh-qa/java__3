package org.example;

public class Whilestring {
    static void main(String[] args) {

        String text ="Software";

        int i =0;
        while (i < text.length()){
            System.out.println("პოზიციაზე დგას სიმბოლო:   "  +   text.charAt(i));
            i++;
        }

    }
}

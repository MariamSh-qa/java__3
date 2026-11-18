package org.example;

public class While1BrContinue {
    static void main(String[] args) {

        int i=0;
        while (i<=3){
            System.out.println(i);
            i++; //Without this it will not stop printing.
        }

        //Break
        //Will stop on 3.
        int j=0;
        while (j<=5){
            if (j==3) break;
            System.out.println(j);
            j++;
        }

        //Continue
        int a=0;
        while (a<=5) {
            if (a == 3) {
                a++;
            continue;
        }
            System.out.println(a);
            a++;
        }




    }
}

package org.example;

public class BreakContinue {
    static void main(String[] args) {

        for (int i=1; i<=20; i++){
            if (i % 3 == 0 && i % 5 ==0)
                break;
            System.out.println(i);
        }


        //Skip 3  - skip happening with CONTINUE.
        for (int i=0; i<=10; i++){
            if (i==3)
                continue;
            System.out.println(i);
        }











    }
}

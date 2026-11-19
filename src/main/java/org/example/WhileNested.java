package org.example;

public class WhileNested {
    static void main(String[] args) {

        int i = 0;
        while (i<3)
        {
            System.out.println("i = " +i);
            i++;


            int j=0;
            while (j<2)
            {
                System.out.println("    j= " +j);
                j++;
            }
        }


    }
}

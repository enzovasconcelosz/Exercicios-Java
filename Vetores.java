package com.company;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int [] temp = new int[10];
        int i= 0;
        Scanner scanner=new Scanner(System.in);

        temp[0]= 15;
        temp[1]= 40;
        temp[2]= 22;

        while(i<=9){
            System.out.println("Insira um elemento no vetor na posição " + i);
            temp[i]= scanner.nextInt();
            i++;
        }

        i=0;

        while (i<10){
            System.out.println(temp[i]);
            i++;
        }


    }
}

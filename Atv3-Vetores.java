package com.company;

import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {
        int tamanho;
        int [] temp;
        int i;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Quantos elementos havera no indice?");
        tamanho= scanner.nextInt();

        temp= new int[tamanho];

        i=0;

        while(i<tamanho){
            System.out.println("Insira um elemento no vetor na posição: " + i);
            temp[i]= scanner.nextInt();
            i++;
        }

        i=0;

        while (i<tamanho){
            System.out.println(temp[i]);
            i++;
        }


    }
}

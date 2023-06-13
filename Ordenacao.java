package com.company;

import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
    int n1, n2, n3, n4, n5;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        n1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        n2 = scanner.nextInt();

        System.out.println("Informe o terceiro numero: ");
        n3 = scanner.nextInt();

        System.out.println("Informe o quarto numero: ");
        n4 = scanner.nextInt();

        System.out.println("Informe o quinto numero: ");
        n5 = scanner.nextInt();

        if (n1>n2 && n1>n3 && n1>n4 && n1>n5){
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);
            System.out.println(n5);
        } else if (n1<n2 && n1>n3 && n1>n4 && n1>n5){
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n4);
            System.out.println(n5);
        } else if (n3>n1 && n2>n3 && n1>n4 && n1>n5){
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n4);
            System.out.println(n5);
        } else if (n2>n3 && n3>n4 && n1<n4 && n1>n5){
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);
            System.out.println(n1);
            System.out.println(n5);
        } else if (n2>n3 && n3>n4 && n4>n5 && n1<n5){
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);
            System.out.println(n5);
            System.out.println(n1);
        } else if (n2>n1 && n2<n3 && n2>n4 && n2>n5){
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n4);
            System.out.println(n5);
        }



}
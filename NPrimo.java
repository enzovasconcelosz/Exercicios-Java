package com.company;

import java.util.Scanner;

public class NPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i=2;
        boolean primo = true;

        System.out.println("Informe um valor inteiro e positivo: ");
        n = scanner.nextInt();

        while (n < 0 ) {
            System.out.println("O valor informado não é positivo.");
            System.out.println("Informe um valor inteiro e positivo: ");
            n = scanner.nextInt();
        }

        while (i <= n-1){
            if(n%i == 0 ){
                primo = false;
            }
            i++;
        }

        if (primo == true) {
            System.out.println("O valor " + n + " é primo.");
        } else {
            System.out.println("O valor " + n + " não é primo.");
        }
    }
}

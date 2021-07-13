package com.company;

import java.util.Scanner;

public class aula_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("peça 2 números e a soma");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("a soma dos 2 números foi: " + num1 + num2);
    }
}

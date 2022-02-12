package com.ready;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNum = sc.nextLong();
        long secondNum = sc.nextLong();
        sc.close();

        System.out.println(firstNum + secondNum);
        System.out.println(firstNum - secondNum);
        System.out.println(firstNum * secondNum);
        System.out.println(firstNum / secondNum);
        System.out.println(firstNum % secondNum);
        System.out.println(String.format("%.2f",(firstNum / (double) secondNum)));
    }
}
package com.ready;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter("-");

        System.out.printf("%06d", sc.nextInt());
        System.out.printf("%07d", sc.nextInt());

    }
}
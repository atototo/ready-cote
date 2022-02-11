package com.ready;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter("\\.");

        System.out.printf("%04d.",sc.nextInt());
        System.out.printf("%02d.",sc.nextInt());
        System.out.printf("%02d",sc.nextInt());

    }
}
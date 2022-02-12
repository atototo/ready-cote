package com.ready;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        List<Integer> ascii = inputStr.chars()
                .boxed()
                .collect(Collectors.toList());
        ascii.forEach(System.out::println);
    }
}
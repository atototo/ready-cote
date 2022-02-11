package com.ready.codeup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 단어(영어) 하나를 입력받는다.
 * (단, 단어의 길이는 20자 이하이다.)
 * ex : Boy
 * result :
 * 'B'
 * 'o'
 * 'y'
 */
public class CodeUp22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charStr = sc.next().toCharArray();

        for (char ch : charStr ) {
            System.out.println("'"+ch+"'");
        }

    }
}

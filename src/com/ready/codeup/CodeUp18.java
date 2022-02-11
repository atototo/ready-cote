package com.ready.codeup;

import java.util.Scanner;

/**
 * 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다.
 * (입력값은 가상의 주민번호이다.)
 * ex)110011-0000000
 *  ex : 000907-1121112
 *  result : 0009071121112
 */
public class CodeUp18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter("-");

        System.out.printf("%06d", sc.nextInt());
        System.out.printf("%07d", sc.nextInt());

    }
}

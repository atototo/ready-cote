package com.ready.codeup;

import java.util.Scanner;

/**
 * 정수 1개가 입력된다.
 * 단, 입력되는 정수의 범위는 -9223372036854775808 ~ +9223372036854775807 이다.
 *
 * 입력된 정수를 그대로 출력한다.
 *
 * ex : -2147483649
 * result : -2147483649
 */
public class CodeUp28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputLong = sc.nextLong();
        sc.close();
        System.out.println(inputLong);
    }

}

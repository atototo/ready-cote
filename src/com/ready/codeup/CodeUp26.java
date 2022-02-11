package com.ready.codeup;

import java.util.Scanner;

/**
 * 정수 1개를 입력받아 그대로 출력해보자.
 * (단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)
 * 정수 1개가 입력된다.
 * (단, 입력되는 정수의 범위는 0 ~ 4294967295 이다.)
 * 입력된 정수를 그대로 출력한다.
 * ex : 2147483648
 * result : 2147483648
 */
public class CodeUp26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputLong = sc.nextLong();
        System.out.println(inputLong);

    }
}

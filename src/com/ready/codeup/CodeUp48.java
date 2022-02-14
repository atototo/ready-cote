package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodEUp48
 * author : isbn8
 * date : 2022-02-12
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-12              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
 * 0 <= a <= 10, 0 <= b <= 10
 *
 * 정수 2개가 공백을 두고 입력된다.
 * 0 <= a, b <= 10
 *
 * a 를 2의 b 제곱배 만큼 곱한 값을 출력한다.
 *
 * ex : 1 3
 * result : 8
 */
public class CodeUp48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();

        System.out.println(first << second);
    }

}

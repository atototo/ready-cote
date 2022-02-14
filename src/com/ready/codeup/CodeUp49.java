package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp49
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
 * 두 정수 a, b가 공백을 두고 입력된다.
 * -2147483648 <= a, b <= +2147483647
 *
 * a가 b보다 큰 경우 1을, 그렇지 않은 경우 0을 출력한다.
 * java true false -> int 변환
 */
public class CodeUp49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();

        System.out.println(first>second ? 1 :0);
    }

}

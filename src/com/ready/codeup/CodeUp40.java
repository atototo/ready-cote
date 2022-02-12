package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp40
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
 *  입력된 정수의 부호를 바꿔 출력해보자.
 * 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
 * 정수 1개가 입력된다.
 * 부호를 바꿔 출력한다.
 */
public class CodeUp40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long inputLong = sc.nextLong();

        System.out.println(inputLong * -1);
    }
}

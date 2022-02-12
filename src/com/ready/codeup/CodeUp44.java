package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp44
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
 * 정수 1개가 입력된다.
 * 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
 * 출력 : 입력된 정수에 1을 더해 출력한다.
 *
 * ex : 2147483647
 * result  : 2147483648
 */
public class CodeUp44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        System.out.println(++num);
    }
}

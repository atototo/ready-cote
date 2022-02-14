package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp42
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
 * 정수 2개(a, b)가 공백을 두고 입력된다.
 * 단, -2147483648 <= a <= b <= +2147483647
 * 출력 : a를 b로 나눈 몫을 출력한다.
 *
 * ex : 1 3
 * result : 0
 */
public class CodeUp42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long firstNum = sc.nextLong();
        long secondNum = sc.nextLong();

        System.out.println(firstNum / secondNum);


    }
}

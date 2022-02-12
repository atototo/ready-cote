package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp43
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
 * 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
 * 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
 *
 * 입력 :
 * 정수 2개(a, b)가 공백을 두고 입력된다.
 * 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
 *
 * 출력 : a 를 b로 나눈 나머지를 출력한다.
 * ex : 10 3
 * result : 3
 */
public class CodeUp43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long firstNum = sc.nextLong();
        long secondNum = sc.nextLong();
        sc.close();

        System.out.println(firstNum % secondNum);

    }

}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp37
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
 * 10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
 * 단, 0 ~ 255 범위의 정수만 입력된다.
 *
 * 10진 정수 -> 아스키 문자
 *  ex : 65
 *  result : A
 */
public class CodeUp37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        char ch = (char) inputNum;
        System.out.println(ch);
    }
}

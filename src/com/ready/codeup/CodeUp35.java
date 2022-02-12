package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp35
 * author : isbn8
 * date : 2022-02-11
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-11              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
 * 2진수, 8진수 16진수를 Scanner로 받으려면 String 데이터타입 또는 int데이터타입을 이용하면된다.
 *
 * String에서 n진수로 변환
 * 2진수 : Integer.valueOf(String s, 2);, return : int
 * 8진수 : Integer.valueOf(String s, 8);, return : int
 * 16진수 : Integer.valueOf(String s, 16);, return : int
 *
 * 16진수를 8진수 변환
 * 16진수 int a
 * String 8진수문자 = Integer.toOctalString(a);
 *
 */
public class CodeUp35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        sc.close();
        //16진수로 변환
        int a = Integer.valueOf(inputStr, 16);
        //8진수로 변환
        String b = Integer.toOctalString(a);
        System.out.println(b);
    }

}

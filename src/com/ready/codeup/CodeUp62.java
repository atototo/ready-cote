package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp62
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
 * 비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.
 * input : 2개의 정수가 공백을 두고 입력된다.
 *  -2147483648 ~ +2147483647
 *  output : 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력한다.
 *  ex : 3 5
 *  result : 6
 */
public class CodeUp62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()^sc.nextInt());
        sc.close();
    }
}

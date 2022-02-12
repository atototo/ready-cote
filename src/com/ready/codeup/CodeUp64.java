package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp64
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
 * 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
 * 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
 *
 * input : 3개의 정수가 공백으로 구분되어 입력된다.
 *  -2147483648 ~ +2147483648
 * output : 가장 작은 값을 출력한다.
 * ex :3 -1 5
 * result : -1
 */
public class CodeUp64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        System.out.println((first>second?second:first) > third ? third : (first>second?second:first));

    }
}

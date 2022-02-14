package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp63
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
 * 입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
 * 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
 * input : 두 정수가 공백을 두고 입력된다.
 *  -2147483648 ~ +2147483647
 * output : 두 정수 중 큰 값을 10진수로 출력한다.
 * ex : 123 456
 * result : 456
 */
public class CodeUp63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        sc.close();
        System.out.println(firstNum>secondNum?firstNum:secondNum);
    }
}

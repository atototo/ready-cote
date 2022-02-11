package com.ready.codeup;

import java.util.Scanner;


/**
 * 10진법 -> N진법
 * 10진법 num 을 N으로 나눌 수 없을 때까지 나누어서 나누어진 값부터 나머지를 나열 하는 것이다
 * 예를 들어 10진법 5를 3진법으로 바꾼다면, 5를 3으로 나누면 나머지 2에 몫은 1이다. 최종 나누어진 값부터 표시하므로 12가 된다.
 *
 * 단순 출력의 경우 int 입력받아서 format 이용 하면 16진수 변경 가능...
 *   System.out.printf("%x", inputNum);
 */
public class CodeUp30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.printf("%x", inputNum);
    }
}

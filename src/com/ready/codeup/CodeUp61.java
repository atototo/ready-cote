package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp61
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
 * 입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
 * 비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.
 *
 * ** | 은 파이프(pipe)연산자라고도 불리는 경우가 있다.
 * 비트단위 or 연산은 둘 중 하나라도 1인 자리를 1로 만들어주는 것과 같다.
 *
 * input :2개의 정수가 공백을 두고 입력된다.
 *  -2147483648 ~ +2147483647
 * output : 두 정수를 비트단위(bitwise)로 or 계산을 수행한 결과를 10진수로 출력한다.
 * ex : 3 5
 * result : 7
 */
public class CodeUp61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()|sc.nextInt());
        sc.close();
    }
}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp59
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
 * 입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
 * 비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)
 * ** 비트단위(bitwise) 연산자는,
 * ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
 * <<(bitwise left shift), >>(bitwise right shift)
 * 가 있다.
 *
 * 예시
 * int a=1;
 * printf("%d", ~a); //-2가 출력된다.
 *
 *  -------------- 참고 -----------------------
 * 컴퓨터에 저장되는 모든 데이터들은 2진수 형태로 바뀌어 저장된다.
 * 0과 1로만 구성되는 비트단위들로 변환되어 저장되는데,
 * 양의 정수는 2진수 형태로 바뀌어 저장되고,
 * 음의 정수는 "2의 보수 표현"방법으로 저장된다.
 * ----------------------------------------------
 * 정수 n이라고 할 때,
 * ~n = -n - 1
 * -n = ~n + 1 과 같은 관계로 표현
 *
 * input : 정수 1개가 입력된다.
 *  -2147483648 ~ +2147483647
 * output : 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
 * ex : 2
 * result : -3
 *
 */
public class CodeUp59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(~sc.nextInt());
        sc.close();
    }
}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodUp60
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
 * 입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
 * 비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)
 *
 * ** 비트단위(bitwise)연산자는,
 * ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
 * <<(bitwise left shift), >>(bitwise right shift) 가 있다.
 *
 * input : 2개의 정수가 공백을 두고 입력된다.
 *  -2147483648 ~ +2147483647
 * output : 두 정수를 비트단위(bitwise)로 and 계산을 수행한 결과를 10진수로 출력한다.
 * ex : 3 5
 * result : 1
 */
public class CodeUp60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()&sc.nextInt());
        sc.close();
    }
}

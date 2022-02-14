package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp55
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
 * 두 개의 참(1) 또는 거짓(0)이 입력될 때,
 * 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
 *
 * 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
 * 하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다.
 * 1 1
 * 1
 */
public class CodeUp55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextInt()==1 || sc.nextInt() ==1)?1 :0);
        sc.close();
    }

}

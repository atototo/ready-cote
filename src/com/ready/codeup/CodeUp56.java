package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp56
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
 * 두 가지의 참(1) 또는 거짓(0)이 입력될 때,
 * 참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.
 * 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
 * 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
 * ex : 1 1
 * result : 0
 */
public class CodeUp56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()!=sc.nextInt()?1:0);
        sc.close();
    }
}

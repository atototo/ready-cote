package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp57
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
 * 참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.
 * input : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
 * output : 참/거짓이 서로 같을 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
 * ex : 0 0
 * result : 1
 */
public class CodeUp57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()==sc.nextInt()?1 :0);
        sc.close();
    }

}

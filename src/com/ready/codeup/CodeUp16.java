package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp16
 * author : isbn8
 * date : 2022-02-10
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-10              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 시(hour)와 분(minute)이 ":" 으로 구분되어 입력된다.
 */
public class CodeUp16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter(":");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + ":" +b);
    }
}

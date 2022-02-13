package com.ready.codeup;

import java.util.Scanner;

/**
 * packageName : com.ready
 * fileName : CodeUp13
 * author : isbn8
 * date : 2022-02-10
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-10              isbn8             최초 생성
 */

/**
 *  코드를 입력받아 순서를 반대로 문자로 출력
 */
public class CodeUp13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = String.valueOf(sc.next());
        String b = String.valueOf(sc.next());

        System.out.println(b +" "+ a );

    }
}

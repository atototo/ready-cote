package com.ready.codeup;

import java.util.Scanner;

/**
 * packageName : com.ready
 * fileName : CodeUp11
 * author : isbn8
 * date : 2022-02-10
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-10              isbn8             최초 생성
 */

/**
 * 입력 받은 실수 그대로 출력
 */
public class CodeUp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        sc.close(); // 자원 낭비 없도록 닫아준다
        System.out.printf("%f\n",num);
    }
}

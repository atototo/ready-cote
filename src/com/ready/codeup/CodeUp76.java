package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp76
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * input : 영문자 1개가 입력된다.
 * (a ~ z)
 * output : a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.
 * ex : f
 * result : a b c d e f
 */
public class CodeUp76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fin  = sc.next().getBytes(StandardCharsets.US_ASCII)[0];
        int start = 'a';
        do {
            System.out.println((char) start++);
        } while (start<=fin);
    }
}

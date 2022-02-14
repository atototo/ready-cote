package com.ready.codeup;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp79
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

/**
 * 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
 *
 * input : 문자들이 1개씩 계속해서 입력된다.
 * output : 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
 * ex : x b k d l q g a c
 * result :
 * x
 * b
 * k
 * d
 * l
 * q
 */
public class CodeUp79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.next().getBytes(StandardCharsets.US_ASCII)[0];
        boolean flag = true;
        while (flag) {

            System.out.println((char) inputNum);
            if(inputNum == 'q') {
                flag = false;
                break;
            }
            inputNum = sc.next().getBytes(StandardCharsets.US_ASCII)[0];

        }
    }
}

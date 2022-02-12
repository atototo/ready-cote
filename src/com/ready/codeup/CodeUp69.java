package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp69
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
 * --------------------------------------
 * 평가 내용
 *  평가 : 내용
 *  A : best!!!
 *  B : good!!
 *  C : run!
 *  D : slowly~
 *  나머지 문자들 : what?
 * ----------------------------------------
 * input : 영문자 1개가 입력된다.
 *  (A, B, C, D 등의 한 문자가 입력된다.)
 * output : 평가내용에 따라 다른 내용이 출력된다.
 * ex : A
 * result : best!!!
 *
 */
public class CodeUp69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getContent(sc.next()));
        sc.close();
    }

    public static String getContent(String grade) {
        String content = "";

        switch (grade) {
            case "A" :
                content = "best!!!";
                break;
            case "B" :
                content = "good!!";
                break;
            case "C" :
                content = "run!";
                break;
            case "D" :
                content = "slowly~";
                break;
            default:
                content = "what?";
                break;
        }
        return content;
    }
}

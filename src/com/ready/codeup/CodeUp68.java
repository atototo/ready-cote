package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp
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
 * 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
 * 평가 기준
 * 점수 범위 : 평가
 *  90 ~ 100 : A
 *  70 ~ 89 : B
 *  40 ~ 69 : C
*    0 ~ 39 : D
 * 로 평가되어야 한다.
 *
 * input : 정수(0 ~ 100) 1개가 입력된다.
 * output : 평가 결과를 출력한다.
 * ex : 73
 * result : B
 */
public class CodeUp68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getGrade(sc.nextInt()));
        sc.close();

    }

    public static String getGrade(int score) {
        String result = "D";
        if(score>=90 && score <=100) {
            result = "A";
        } else if (score>=70 && score <90) {
            result = "B";
        } else if (score>=40 && score<70) {
            result = "C";
        } else {
            result = "D";
        }
        return result;
    }
}

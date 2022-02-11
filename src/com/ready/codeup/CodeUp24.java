package com.ready.codeup;

import java.util.Scanner;

/**
 * 입력되는 시:분:초 에서 분만 출력해보자.
 * 시 분 초가
 * 시:분:초 형식으로 입력된다.
 * 분만 출력한다. 01 분 -> 1 로 출력
 * ex : 17:23:57
 * result : 23
 */
public class CodeUp24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d",Integer.parseInt(sc.next().split(":")[1]));

    }
}

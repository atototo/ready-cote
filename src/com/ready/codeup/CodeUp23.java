package com.ready.codeup;

import java.util.Scanner;

/**
 * 다섯 자리로 이루어진 1개의 정수를 입력받는다.
 * (단, 10,000 <= 입력받는 수 <= 99,999 )
 * 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
 * ex : 75254
 * result
 * [70000]
 * [5000]
 * [200]
 * [50]
 * [4]
 */
public class CodeUp23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();

        System.out.printf("[%s0000]\n",inputStr.substring(0,1));
        System.out.printf("[%s000]\n",inputStr.substring(1,2));
        System.out.printf("[%s00]\n",inputStr.substring(2,3));
        System.out.printf("[%s0]\n",inputStr.substring(3,4));
        System.out.printf("[%s]\n",inputStr.substring(4,5));

    }
}

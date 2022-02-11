package com.ready.codeup;

import java.util.Scanner;

/**
 * 실수 1개가 입력된다.
 * (단, 입력값은 절댓값이 10000을 넘지 않으며, 소수점 이하 자릿수는 최대 6자리까지이고
 * 0이 아닌 숫자로 시작한다.)
 * 첫 번째 줄에 정수 부분을, 두 번째 줄에 실수 부분을 출력한다.
 * ex : 1.414213
 * result :
 * 1
 * 414213
 */
public class CodeUp21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter("\\.");

        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());

    }
}

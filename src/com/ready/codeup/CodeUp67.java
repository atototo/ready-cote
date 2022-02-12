package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp67
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
 * 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
 *
 * input : 정수 1개가 입력된다.
 *  -2147483648 ~ +2147483647, 단 0은 입력되지 않는다
 * output : 입력된 정수에 대해
 *  첫 줄에 minus 나 plus 를 출력하고,
 *  두 번째 줄에 odd 나 even 을 출력한다.
 * ex : -2147483648
 * result :
 *  minus
 *  even
 */
public class CodeUp67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(num >0 ? "plus" :"minus");
        System.out.println(num%2==0?"even":"odd");

    }
}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp51
 * author : isbn8
 * date : 2022-02-12
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-12              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 두 정수(a, b)를 입력받아
 * b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
 *
 * 두 정수 a, b가 공백을 두고 입력된다.
 * -2147483647 <= a, b <= +2147483648
 * b가 a보다 크거나 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
 *
 * ex : 0 -1
 * result : 0
 */
public class CodeUp51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()<=sc.nextInt()?1:0);
        sc.close();
    }
}

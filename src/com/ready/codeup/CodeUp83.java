package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp83
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * input : 10 보다 작은 정수 1개가 입력된다.(1 ~ 9)
 * output : 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
 *  3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
 * ex : 9
 * result : 1 2 X 4 5 X 7 8 X
 */
public class CodeUp83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStream.rangeClosed(1, sc.nextInt())
                .forEach(t ->
                        System.out.println(t % 3 == 0 ? "X" : t)
                );
        sc.close();
    }
}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp72
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
 * input : 첫 줄에 정수의 개수 n이 입력되고,
 * 두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
 * -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
 * output : n개의 정수를 한 개씩 줄을 바꿔 출력한다.
 * ex : 5
 *  1 2 3 4 5
 * result :
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class CodeUp72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStream.rangeClosed(1, sc.nextInt())
                .forEach(t -> System.out.println(sc.nextInt()));
        sc.close();

    }
}

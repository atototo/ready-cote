package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp78
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
 * input : 정수 1개가 입력된다.
 * (0 ~ 100)
 * output : 1부터 입력된 수까지 짝수의 합을 출력한다.
 * ex : 5
 * result : 6
 */
public class CodeUp78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(IntStream.rangeClosed(1, sc.nextInt())
                .filter(t -> t % 2 == 0)
                .sum());
        sc.close();
    }
}

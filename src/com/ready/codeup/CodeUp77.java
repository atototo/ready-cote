package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp77
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
 * output : 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
 * ex : 4
 * result :
 * 0
 * 1
 * 2
 * 3
 * 4
 */
public class CodeUp77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStream.rangeClosed(0, sc.nextInt())
                .forEach(System.out::println);
        sc.close();
    }

}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp65
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
 * input : 세 정수 a, b, c 가 공백을 두고 입력된다.
 *  0 ~ +2147483647 범위의 정수들이 입력되며 적어도 1개는 짝수이다.
 * output : 짝수만 순서대로 줄을 바꿔 출력한다.
 * ex : 1 2 4
 * result :
 * 2
 * 4
 */
public class CodeUp65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        sc.close();

        list.parallelStream()
                .filter(t -> t % 2 == 0)
                .forEachOrdered(System.out::println);

    }
}

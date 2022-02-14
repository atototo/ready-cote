package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp66
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
 *
 * input : 세 정수 a, b, c 가 공백을 두고 입력된다.
 *  0 <= a, b, c <= +2147483647
 * output :  입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.
 * ex : 1 2 8
 * result :
 * odd
 * even
 * even
 */
public class CodeUp66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        list.parallelStream()
                .map(t -> t%2==0?"even":"odd")
                .forEachOrdered(System.out::println);
    }
}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp80
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
 * 1, 2, 3 ... 을 계속 더해 나갈 때,
 * 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
 * 계속 더하는 프로그램을 작성해보자.
 *
 * input : 정수 1개가 입력된다.
 * output : 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
 * 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
 * ex : 55
 * result: 10
 */
public class CodeUp80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        sc.close();
        int total = 0;
        int addNum = 0;
        while (total<inputNum) {
            total += addNum++;
        }
        System.out.println(--addNum);

    }
}

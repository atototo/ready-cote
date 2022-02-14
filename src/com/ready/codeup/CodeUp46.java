package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp46
 * author : isbn8
 * date : 2022-02-12
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-12              isbn8             최초 생성
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 정수 3개를 입력받아 합과 평균을 출력해보자.
 * 단, -2147483648 ~ +2147483647
 *
 * 정수 3개가 공백을 두고 입력된다.
 * 단, -2147483648 ~ +2147483647
 *
 * 출력
 * 합과 평균을 줄을 바꿔 출력한다.
 * 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
 *
 * ex :1 2 3
 * result :
 * 6
 * 2.0
 */
public class CodeUp46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Long> list = new ArrayList<>();
        list.add(sc.nextLong());
        list.add(sc.nextLong());
        list.add(sc.nextLong());
        sc.close();

        System.out.println(list.stream().mapToInt(Long::intValue).sum());
        System.out.println(String.format("%.1f", list.stream().mapToDouble(Long::doubleValue).average().getAsDouble()));

    }
}

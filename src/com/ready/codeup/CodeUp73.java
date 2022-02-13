package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp73
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *  input :정수가 순서대로 입력된다.
 *  -2147483648 ~ +2147483647, 단 개수는 알 수 없다.
 * output : 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
 *  (0은 출력하지 않는다.)
 * ex : 7 4 2 3 0 1 5 6 9 10 8
 * result :
 * 7
 * 4
 * 2
 * 3
 */
public class CodeUp73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");
        for (String tmp : inputArr) {
            if (tmp.equals("0")) break;
            System.out.println(tmp);
        }
        sc.close();
    }

    public static void doWithLambda(Scanner sc) {
        String[] inputArr = sc.nextLine().split(" ");
        Arrays.stream(inputArr)
                .takeWhile(tmp -> !tmp.equals("0"))
                .forEach(System.out::println);
        sc.close();
    }
}

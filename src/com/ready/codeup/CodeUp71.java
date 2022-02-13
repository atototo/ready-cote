package com.ready.codeup;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp71
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

/**
 * 정수가 순서대로 입력된다.
 * -2147483648 ~ +2147483647, 단 개수는 알 수 없다.
 * 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
 *
 * input : 정수가 순서대로 입력된다.
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
public class CodeUp71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String tmp : sc.nextLine().split(" ")) {
            if(tmp.equals("0")) {
                break;
            }
            System.out.println(tmp);
        }
        sc.close();
    }
}

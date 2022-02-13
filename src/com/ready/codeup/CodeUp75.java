package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp75
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 *  input : 정수 1개가 입력된다.
 * (1 ~ 100)
 *  output : 1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력한다.
 *  ex : 5
 *  result :
 *  4
 * 3
 * 2
 * 1
 * 0
 */
public class CodeUp75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        sc.close();
        while(startNum>0) {
            System.out.println(--startNum);
        }

    }
}

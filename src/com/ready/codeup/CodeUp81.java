package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp81
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
 * 1부터 n까지, 1부터 m까지 숫자가 적힌
 * 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
 * input : 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
 *  단, n, m은 10이하의 자연수
 * output : 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
 *  첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
 * ex : 2 3
 * result :
 * 1 1
 * 1 2
 * 1 3
 * 2 1
 * 2 2
 * 2 3
 */
public class CodeUp81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();
        for (int i=1;i<=first;i++) {
            for (int j=1;j<=second;j++) {
                System.out.println(i + " " +j);
            }
        }
    }
}
package com.ready.codeup;

import java.util.Scanner;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp17
 * author : isbn8
 * date : 2022-02-10
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-10              isbn8             최초 생성
 */

/**
 * 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
 * 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
 * (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
 * ex : 2013.8.5
 * result : 2013.08.05
 */
public class CodeUp17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter("\\.");

        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();



        System.out.printf("%4d.",yyyy);
        System.out.printf("%02d.",sc.nextInt());
        System.out.printf("%02d",sc.nextInt());

    }

}

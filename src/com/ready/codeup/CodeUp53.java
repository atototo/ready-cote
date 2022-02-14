package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp53
 * author : isbn8
 * date : 2022-02-12
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-12              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
 * 반대로 출력하는 프로그램을 작성해보자.
 *
 * 정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)
 * 입력된 값이 0이면 1, 1이면 0을 출력한다.
 *
 * ex : 1
 * result : 0
 */

public class CodeUp53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()==1?0:1);
        sc.close();
    }

}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp34
 * author : isbn8
 * date : 2022-02-11
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-11              isbn8             최초 생성
 */

import java.util.Scanner;

/**
 * 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
 * 참고
 * %o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다.
 * %d로 출력하면 10진수로 출력된다.
 *
 * JAVA Integer 클래스를 이용하면 2,8,16진수의 숫자를 10진수로 쉽게 변환이 가능하다.
 *
 */
public class CodeUp34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();
        int num = Integer.valueOf(inputStr, 8);
        System.out.println(num);

    }
}

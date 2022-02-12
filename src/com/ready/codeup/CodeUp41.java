package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp41
 * author : isbn8
 * date : 2022-02-12
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-12              isbn8             최초 생성
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 영문자 1개를 입력받아 그 다음 문자를 출력해보자.
 *
 * ex : a
 * result : b
 */
public class CodeUp41 {

    public static void main(String[] args) {
        //1. 입력 받기
        Scanner sc = new Scanner(System.in);

        //2. 입력받은 문자 아스키코드로 변환
        byte[] bytes = sc.next().getBytes(StandardCharsets.US_ASCII);
        sc.close();
        //3. 아스키코드 +1, 문자형으로 변환 : 다음 문자로 변경
        char ch = (char) (bytes[0] +1);
        System.out.println(ch);
    }
}

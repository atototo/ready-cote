package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp36
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
import java.util.stream.Collectors;

/**
 * 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
 * 아스키 코드는
 * (ASCII, 미국표준코드, American Standard Code for Information Interchange)
 * 영문자, 특수 문자 등을 저장할 때 사용하는 표준 코드이다.
 * 컴퓨터로 저장되는 모든 데이터는 2진 정수화되어 저장되는데,
 * 영문자와 특수기호 등을 저장하는 방법으로 아스키코드가 기본적으로 사용된다.
 *
 * 예를 들어 영문 대문자 "A"는 10진수 65를 의미하는 2진수 값으로 저장된다.
 *
 * java 9 버전 이상에서는 문자를 ASCII 값으로 변환하는 String.chars() API 사용하면 된다,.
 * 1) String -> .chars() API를 이용하여 chars 배열 생성
 * 2) .boxed()를 사용하여 integer 객체의 스트림을 가져온다
 * 3) .collect(Collectors.toList());  변환된 아스키 코드 값을 리스트로 생성한다
 */
public class CodeUp36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        var ascii = inputStr.chars()
                .boxed()
                .collect(Collectors.toList());
        ascii.forEach(System.out::println);
    }
}

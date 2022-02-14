package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp47
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
 * 정수 한 개가 입력된다.
 * 단, -1073741824 ~ +1073741823
 *
 * 2진수 형태로 저장되어 있는 값들을 왼쪽(<<)이나 오른쪽(>>)으로
 * 지정한 비트 수만큼 밀어주면 2배씩 늘어나거나 반으로 줄어드는데,
 * 왼쪽 비트시프트(<<)가 될 때에는 오른쪽에 0이 주어진 개수만큼 추가되고,
 * 오른쪽 비트시프트(>>)가 될 때에는
 * 왼쪽에 0(0 또는 양의 정수인 경우)이나 1(음의 정수인 경우)이 개수만큼 추가된다.
 *
 * int a=10;
 * printf("%d", a<<1); //10을 2배 한 값인 20 이 출력된다.
 * printf("%d", a>>1); //10을 반으로 나눈 값인 5 가 출력된다.
 * printf("%d", a<<2); //10을 4배 한 값인 40 이 출력된다.
 * printf("%d", a>>2); //10을 반으로 나눈 후 다시 반으로 나눈 값인 2 가 출
 *
 */
public class CodeUp47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("%d",  sc.nextInt()<<1));
        sc.close();
    }

}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp38
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
 * 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
 * (단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
 *
 * 2개의 정수가 공백으로 구분되어 입력된다.
 * ** 주의 : 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.
 * 두 정수의 합을 출력한다.
 *
 * JAVA Scanner useDelimiter 공백 인식 안된다
 * scanner 의 특성을 이용해 next() 를 사용하면 공백 기준으로 다음 단어를 찍을 수 있다.
 * ex : 123 -123
 * 1073741824 -1073741824
 * result : 0
 *
 * remember : 합산 결과가 int 범위를 넘는지 생각 후 진행해야 한다.
 * */
public class CodeUp38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        long firstNum = sc.nextLong();
        long secondNum = sc.nextLong();
        sc.close();

        System.out.println(firstNum+secondNum);

    }
}

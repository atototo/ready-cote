package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp82
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * input : 16진수로 한 자리 수가 입력된다.
 *  단, A ~ F 까지만 입력된다.
 * output : 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
 *  계산 결과도 16진수로 출력해야 한다.
 * ex : B
 * result :
 * B*1=B
 * B*2=16
 * B*3=21
 * B*4=2C
 * B*5=37
 * B*6=42
 * B*7=4D
 * B*8=58
 * B*9=63
 * B*A=6E
 * B*B=79
 * B*C=84
 * B*D=8F
 * B*E=9A
 * B*F=A5
 */
public class CodeUp82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        int num = Integer.parseInt(inputStr, 16);
        sc.close();

        for (int i=1;i<=Integer.parseInt("f", 16 ); i++) {
            System.out.println(inputStr +"*"+ Integer.toHexString(i).toUpperCase()+"="+Integer.toHexString(num * i).toUpperCase());
        }



    }
}

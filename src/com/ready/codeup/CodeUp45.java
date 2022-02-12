package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp45
 * author : isbn8
 * date : 2022-02-12
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-12              isbn8             최초 생성
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
 * 단 0 <= a, b <= 2147483647, b는 0이 아니다.
 *
 * 입력 : 정수 2개가 공백을 두고 입력된다.
 * 출력 :
 * 첫 줄에 합
 * 둘째 줄에 차,
 * 셋째 줄에 곱,
 * 넷째 줄에 몫,
 * 다섯째 줄에 나머지,
 * 여섯째 줄에 나눈 값을 순서대로 출력한다.
 * (실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
 *
 * ex : 10 3
 * result
 * 13
 * 7
 * 30
 * 3
 * 1
 * 3.33
 */
public class CodeUp45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNum = sc.nextLong();
        long secondNum = sc.nextLong();
        sc.close();

        System.out.println(firstNum + secondNum);
        System.out.println(firstNum - secondNum);
        System.out.println(firstNum * secondNum);
        System.out.println(firstNum / secondNum);
        System.out.println(firstNum % secondNum);
        // String format 방식
        System.out.println("String format : " + String.format("%.2f",(firstNum / (double) secondNum)));
        // Number format 방식
        System.out.println("Number format : " +cutDecimal(2, (double) firstNum / (double) secondNum));
        // Math.round 방식
//        (double)Math.round(a*100)/100
        System.out.println("Math.round  : " +(double)Math.round((firstNum / (double) secondNum)*100)/100);
    }

    public static String cutDecimal(int cutSize, double value) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(cutSize);
        nf.setGroupingUsed(false);

        return nf.format(value);
    }
}

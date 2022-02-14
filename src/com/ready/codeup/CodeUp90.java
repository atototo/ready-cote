package com.ready.codeup;


import java.io.*;

/**
 * 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
 *
 * 예를 들어
 * 2 6 18 54 162 486 ... 은
 * 2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.
 *
 * 이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여
 * 등비(비율이 같다의 한문 말) 수열이라고 한다.
 *
 * input : 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
 * 공백을 두고 입력된다.(모두 0 ~ 10)
 * output : n번째 수를 출력한다.
 * ex : 2 3 7
 * result : 1458
 */
public class CodeUp90 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = br.readLine().split(" ");
        long startNum = Long.parseLong(inputArr[0]);
        long balNum = Long.parseLong(inputArr[1]);
        long timesNum = Long.parseLong(inputArr[2]);
        calc(startNum, balNum, timesNum, 1);
    }

    public static void calc(long startNum, long balNum, long timesNum, int count ) {
        if (count == timesNum) {
            System.out.println(String.format("%d",startNum));
            return;
        }
        calc(startNum * balNum, balNum, timesNum, ++count);

    }
}

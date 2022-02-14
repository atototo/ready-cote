package com.ready.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
 *
 * 예를 들어
 * 1 -1 3 -5 11 -21 43 ... 은
 * 1부터 시작해 이전에 만든 수에 -2를 곱한 다음 1을 더해 다음 수를 만든 수열이다.
 *
 * input : 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
 *  공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
 * output : n번째 수를 출력한다.
 * ex : 1 -2 1 8
 * result : -85
 */
public class CodeUp91  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        long startNum = Integer.parseInt(inputArr[0]);
        long timesNum = Integer.parseInt(inputArr[1]);
        long addNum = Integer.parseInt(inputArr[2]);
        long cntNum = Integer.parseInt(inputArr[3]);
        calc(startNum, timesNum, addNum, cntNum, 1);
    }

    public static void calc(long startNum, long timesNum,long addNum, long cntNum, int cnt) {

        if (cnt == cntNum) {
            System.out.println(startNum);
            return;
        }

        calc(((startNum*timesNum)+addNum), timesNum, addNum, cntNum, ++cnt);

    }
}

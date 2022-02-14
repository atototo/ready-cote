package com.ready.codeup;

import java.io.*;
import java.util.stream.IntStream;

/**
 * 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(series)이라고 한다.
 * input : 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
 * 공백을 두고 입력된다.(모두 0 ~ 100)
 * output : n번째 수를 출력한다.
 * ex : 1 3 5
 * result : 13
 */
public class CodeUp89 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputArr = br.readLine().split(" ");
        int startNum = Integer.parseInt(inputArr[0]);
        int skipNum = Integer.parseInt(inputArr[1]);
        int timesNum = Integer.parseInt(inputArr[2]);

        int result = (skipNum * (--timesNum)) + startNum;

        bw.write(String.format("%d", result));
        bw.flush();


    }
}

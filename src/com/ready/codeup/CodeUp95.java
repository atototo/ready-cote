package com.ready.codeup;

import java.io.*;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * input : 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
 *  n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
 * output : 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
 * ex : 10
 * 10 4 2 3 6 6 7 9 8 5
 * result : 2
 */
public class CodeUp95 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split(" ");

        int result = Arrays.stream(numArr)
                .mapToInt(Integer::parseInt)
                .min().orElse(0);

        bw.write(String.format("%d", result));
        bw.flush();
    }
}

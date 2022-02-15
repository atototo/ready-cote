package com.ready.codeup;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * input : 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
 * 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
 * output : 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
 * ex : 10
 * 1 3 2 2 5 6 7 4 5
 * result : 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 */
public class CodeUp93 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalCall = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        IntStream.rangeClosed(1, 23).forEach(i -> {
            map.put(i, 0);
            Arrays.stream(numArr)
                    .filter(tmp -> i == Integer.parseInt(tmp))
                    .forEach(tmp -> map.put(i, map.get(i) + 1));
        });

        for(int key : map.keySet()){
            bw.write(String.format("%d ", map.get(key)));
        }
        bw.flush();

    }

}

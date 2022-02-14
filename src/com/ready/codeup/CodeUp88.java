package com.ready.codeup;

import java.io.*;
import java.util.stream.IntStream;

/**
 * 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
 * 3의 배수인 경우는 출력하지 않도록 만들어보자.
 *
 * input : 정수 1개를 입력받는다.
 * (1 ~ 100)
 * output : 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
 * 3의 배수는 출력하지 않는다.
 * ex : 10
 * result : 1 2 4 5 7 8 10
 */
public class CodeUp88 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        IntStream.rangeClosed(1, Integer.parseInt(input))
                .filter(a -> a%3!=0)
                .forEach(System.out::println);

    }
}

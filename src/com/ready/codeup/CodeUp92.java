package com.ready.codeup;

import java.io.*;

/**
 * 자! 여기서...잠깐..
 * 같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
 * 매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
 *
 * 예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
 * 한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.
 * 예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
 * 한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.
 *
 * input : 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,
 * 방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)
 * output : 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
 * ex : 3 7 9
 * result : 63
 */
public class CodeUp92 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int firstTerm = Integer.parseInt(arr[0]);
        int secondTerm = Integer.parseInt(arr[1]);
        int thirdTerm = Integer.parseInt(arr[2]);

        boolean flag = true;
        int day = 1;
        while (flag){
            if(day%firstTerm==0&&day%secondTerm==0&&day%thirdTerm==0){
                break;
            }
            day++;
        }
        bw.write(String.format("%d", day));
        bw.flush();

    }
}

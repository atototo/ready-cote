package com.ready;


import java.io.*;

public class Main {

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
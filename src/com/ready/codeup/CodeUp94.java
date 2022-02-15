package com.ready.codeup;

import java.io.*;


/**
 * input : 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
 * n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
 * output : 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
 * ex : 10
 * 10 4 2 3 6 6 7 9 8 5
 * result : 5 8 9 7 6 6 3 2 4 10
 */
public class CodeUp94 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        String[] callArr = br.readLine().split(" ");
        for (int i = (cnt-1);i >=0;i--){
            bw.write(String.format("%s ",callArr[i]));
        }
        bw.flush();
    }
}

package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp84
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.io.*;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * input : 빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
 *  예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.
 * output : 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
 *  줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
 * ex : 2 2 2
 * result :
 * 0 0 0
 * 0 0 1
 * 0 1 0
 * 0 1 1
 * 1 0 0
 * 1 0 1
 * 1 1 0
 * 1 1 1
 * 8
 */
public class CodeUp84 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] colors = br.readLine().split(" ");

        int count = 0;
        for (int i =0;i < Integer.valueOf(colors[0]); i++){
            for (int j=0;j<Integer.valueOf(colors[1]);j++) {
                for (int k=0;k<Integer.valueOf(colors[2]);k++){
                    bw.write(i + " "+ j + " "+k + "\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        //flush 해야 진짜 출력
        bw.flush();
    }

}

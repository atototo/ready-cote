package com.ready.codeup;

import java.io.*;
import java.util.stream.IntStream;

/**
 * input : 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
 * 둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
 * n은 10이하의 자연수이고  x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.
 * output : 흰 돌이 올려진 바둑판의 상황을 출력한다.
 * 흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
 * ex :
 * 5
 * 1 1
 * 2 2
 * 3 3
 * 4 4
 * 5 5
 * result :
 * 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 */
public class CodeUp96 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalWhite = Integer.parseInt(br.readLine());
        int[][] arr = new int[19][19];

        int cnt = 0;
        while(cnt < totalWhite) {
            String[] tmpArr = br.readLine().split(" ");
            arr[Integer.parseInt(tmpArr[0])-1][Integer.parseInt(tmpArr[1])-1] =1;
            cnt++;
        }
        for (int i=0;i<19;i++) {
            for (int j=0;j<19;j++) {
                bw.write(String.format("%d ",arr[i][j]));
            }
            bw.write("\n");
        }

        bw.flush();


    }

}

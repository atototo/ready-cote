package com.ready.codeup;

import java.io.*;

/**
 * 1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
 * 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
 *
 * input : 언제까지 합을 계산할 지, 정수 1개를 입력받는다.
 *  단, 입력되는 자연수는 100,000,000이하이다.
 * output : 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
 *  그때까지의 합을 출력한다.
 * ex : 57
 * result: 66
 */
public class CodeUp87 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int num = Integer.parseInt(input);
        int total =0;
        int cnt =1;

        for (int i=1;i<=num;i++) {
            total+=i;
            if(total >= num) {
                break;
            }
        }

        bw.write(String.format("%d", total));
        bw.flush();

    }
}

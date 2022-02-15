package com.ready;


import java.io.*;



public class Main {

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
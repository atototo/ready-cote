package com.ready.codeup;

/**
 * packageName : com.ready.codeup
 * fileName : CodeUp85
 * author : isbn8
 * date : 2022-02-13
 * description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2022-02-13              isbn8             최초 생성
 */

import java.io.*;

/**
 * 소리가 컴퓨터에 저장될 때에는 디지털 데이터화 되어 저장된다.
 *
 * 1초 동안 마이크로 소리강약을 체크하는 수를 h
 * (헤르쯔, Hz 는 1초에 몇 번? 체크하는가를 의미한다.)
 * 한 번 체크한 결과를 저장하는 비트 b
 * (2비트를 사용하면 0 또는 1 두 가지, 16비트를 사용하면 65536가지..)
 * 좌우 등 소리를 저장할 트랙 개수인 채널 c
 * (모노는 1개, 스테레오는 2개의 트랙으로 저장함을 의미한다.)
 * 녹음할 시간 s가 주어질 때,
 * 실제로 일반적인 CD 음질(44.1KHz, 16bit, 스테레오)로 1초 동안 저장하려면
 * 44100 * 16 * 2 * 1 bit의 저장공간이 필요하다.
 * ---------------------------------
 *  8 bit(비트)           = 1byte(바이트)     //       8bit=1Byte
 * 1024 Byte(2^10 byte) = 1KB(킬로 바이트) // 1024bit=1KB
 * 1024 KB(2^10 KB)      = 1MB(메가 바이트)
 * 1024 MB(2^10 MB)     = 1GB(기가 바이트)
 * 1024 GB(2^10 GB)      = 1TB(테라 바이트)
 * --------------------------------
 *
 * input : h, b, c, s 가 공백을 두고 입력된다.
 *  h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
 * output : 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
 *  단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
 * ex : 44100 16 2 10
 * result : 1.7 MB
 *
 */
public class CodeUp85 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputArr = br.readLine().split(" ");

        long times = 1L;
        for (String tmp : inputArr) {
            times *= Integer.parseInt(tmp);
        }
        bw.write(String.format("%.1f MB",(double)times / (8 * 1024 * 1024)));
        bw.flush();


    }
}

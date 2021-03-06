package com.ready.codeup;

import java.io.*;
import java.util.Arrays;

/**
 * 이미지가 컴퓨터에 저장될 때에도 디지털 데이터화 되어 저장된다.
 *
 * 가장 기본적인 방법으로는 그림을 구성하는 한 점(pixel, 픽셀)의 색상을
 * 빨강(r), 초록(g), 파랑(b)의 3가지의 빛의 세기 값으로 따로 변환하여 저장하는 것인데,
 *
 * 예를 들어 r, g, b 각 색에 대해서 8비트(0~255, 256가지 가능)씩을 사용한다고 하면,
 *
 * 한 점의 색상은 3가지 r, g, b의 8비트+8비트+8비트로 총 24비트로 표현해서
 * 총 2^24 가지의 서로 다른 빛의 색깔을 사용할 수 있는 것이다.
 * 그렇게 저장하는 점을 모아 하나의 큰 이미지를 저장할 수 있게 되는데,
 * 1024 * 768 사이즈에 각 점에 대해 24비트로 저장하면 그 이미지를 저장하기 위한
 * 저장 용량을 계산할 수 있다.
 * 이렇게 이미지의 원래(raw) 데이터를 압축하지 않고 그대로 저장하는 대표적인 이미지 파일이
 * *.bmp 파일이며, 비트로 그림을 구성한다고 하여 비트맵 방식 또는 래스터 방식이라고 한다.
 * 예를 들어
 * 일반적인 1024 * 768 사이즈(해상도)의 각점에 대해
 * 24비트(rgb 각각 8비트씩 3개)로 저장하려면 1024 * 768 * 24 bit의 저장 용량이 필요하다.
 *
 * input : w, h, b 가 공백을 두고 입력된다.
 *  단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
 * output : 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
 *  소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
 * ex : 1024 768 24
 * result : 2.25 MB
 */
public class CodeUp86 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try {
            String[] inputStr = br.readLine().split(" ");
            int result = Arrays.stream(inputStr)
                    .map(t -> Integer.parseInt(t))
                    .reduce(1, (a, b) -> a * b);

            bw.write(String.format("%.2f MB", result/(double) (8*1024*1024)));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

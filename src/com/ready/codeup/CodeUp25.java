package com.ready.codeup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 년월일이 '.'(닷)으로 구분되어 입력된다.
 * 년월일을
 *
 * 일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다.
 * ex : 2014.07.15
 * result : 15-07-2014
 */
public class CodeUp25 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat formatOutput = new SimpleDateFormat("dd-MM-yyyy");

        Scanner sc = new Scanner(System.in);
        Date date = format.parse(sc.next());
        System.out.println(formatOutput.format(date));

    }
}

package org.example.inflearnAlgo;

import java.util.Arrays;
import java.util.Scanner;

/*
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

문자열은 영어 알파벳으로만 구성되어 있습니다.

 */
public class b대소문자변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (String.valueOf(c[i]).equals(String.valueOf(c[i]).toUpperCase())) {
                String str = c[i] + "";
                str = str.toLowerCase();
                c[i] = str.charAt(0);
                continue;
            }
            if (String.valueOf(c[i]).equals(String.valueOf(c[i]).toLowerCase())) {
                String str = c[i] + "";
                str = str.toUpperCase();
                c[i] = str.charAt(0);
            }
        }
        System.out.println(new String(c));
    }
}

package org.example.inflearnAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


*/
public class j가장짧은문자거리 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String find = st.nextToken();
        String result = "";
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
           if (String.valueOf(str.charAt(i)).equals(find)) {
               index = 0;
               result += index + " ";
           }
           if (!String.valueOf(str.charAt(i)).equals(find)) {
               index++;
               if (str.indexOf(find) - i > 0) {
                   result += str.indexOf(find) - i + " ";
                   continue;
               }
               result += index + " ";
           }
        }
        System.out.println("result = " + result);
        String[] strL = result.split(" ");
        result = "";
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(str.length() - (i + 1))).equals(find)) {
                index = 0;
                result += index + " ";
            }
            if (!String.valueOf(str.charAt(str.length() - (i + 1))).equals(find)) {
                index++;
                result += index + " ";
            }
        }
        String[] strR = result.split(" ");
        System.out.println("result = " + result);
        result = "";

        for (int i = 0; i < str.length(); i++) {
            result += Math.min(Integer.parseInt(String.valueOf(strL[i])), Integer.parseInt(String.valueOf(strR[strR.length - (i + 1)]))) + " ";
        }
        System.out.println(result);
    }
/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String find = st.nextToken();
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            int dis = 9999;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals(find)) {
                    if (dis > Math.abs(j - i)) {
                        dis = Math.abs(j - i);
                    }

                }
            }
            result += dis + " ";
        }

        System.out.println("result = " + result);
    }
*/

}

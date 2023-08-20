package org.example.inflearnAlgo;

import java.util.Scanner;
/*
* 설명
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.


*/
public class g회문문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        //이게 더 간편한듯
/*
        StringBuilder sb = new StringBuilder(str);
        System.out.println("sb.reverse() = " + sb.reverse());
*/
         boolean b = flip(str.toLowerCase());
         if (b) {
             System.out.println("YES");
         }
         if (!b) {
             System.out.println("NO");
         }

    }
    static boolean flip(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - (1 + i)));
        }
        if (str.contentEquals(sb)) {
            return true;
        }
        return false;
    }
}

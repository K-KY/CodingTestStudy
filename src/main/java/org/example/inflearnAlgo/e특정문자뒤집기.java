package org.example.inflearnAlgo;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

***************
강의 보니까 이거 투포인터 문제였던거 같음
투포인터로 다시 풀어보셈
*/
public class e특정문자뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str  = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).matches("[a-zA-Z]")) {
                String target = str.charAt(i) + "";
                arr.add(target);
                str = str.replaceFirst(target, index+"");
                index++;
            }
            if (index == 9) {
                index = 0;
            }
        }
        index = arr.size() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).matches("[0-9]")) {
                String target = str.charAt(i) + "";
                str = str.replaceFirst(target, arr.get(index));
                index--;
            }
        }
        System.out.println(str);
    }

}

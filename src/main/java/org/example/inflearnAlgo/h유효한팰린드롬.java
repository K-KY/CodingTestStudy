package org.example.inflearnAlgo;

import java.util.Scanner;

/*설명
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.

string 을 lowerCase 로 바꿈
[a-z0-9] 를 제외한 문자 삭제 -> 공백으로 바꾸고 전체 공백을 제거한다
문자열을 거꾸로 출력후 저장
저장된 값과 입력된 값을 비교

*/
public class h유효한팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String compare = "";
        String str = sc.nextLine();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            String target = str.charAt(i) + "";
            if (!target.matches("[a-z0-9]")) {
                str = str.replace(target, " ");
            }
        }
        str = str.replace(" ", "");
        compare = flip(str);
        if (compare.equals(str)) {
            System.out.println("YES");
        }
        if (!compare.equals(str)) {
            System.out.println("NO");
        }
    }
    static String flip(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - (1 + i)));
        }
        return sb.toString();
    }
}

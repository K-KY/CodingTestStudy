package org.example.inflearnAlgo.string;

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
//대소문자를 구분하지 않음으로 전부 소문자로 바꾼다

        //알파벳을 제외한 문자는 무시 -> 알파벳을 제외한 문자 삭제
        for (int i = 0; i < str.length(); i++) {
            String target = str.charAt(i) + "";
            //0-9 를 왜 했는지 모르겠는데 알파벳 외 문자는 무시하기 때문에 0-9 가 없어도 됨
            //운좋게 통과함
            //a ~ z 0 ~ 9 외 문자를 공백으로 바꾼다
            //공백으로 바꾸는 이유는 str 의 길이가 달라져서 인덱스가 바뀌기 때문에 그걸 방지하기 위해 공백으로 바꿈
            if (!target.matches("[a-z0-9]")) {
                str = str.replace(target, " ");
            }
        }
        //공백을 전부 삭제
        str = str.replace(" ", "");
        //문자열을 뒤집는다
        compare = flip(str);
        //뒤집은 문자열과 원래 문자열이 같은지 확인한다
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

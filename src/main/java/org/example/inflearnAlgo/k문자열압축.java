package org.example.inflearnAlgo;

import java.util.Scanner;

public class k문자열압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + "#";
        String compareWith = "";
        StringBuilder result = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            //비교하려는 것과 i 번째 글자가 같으면 cnt++
            if (String.valueOf(str.charAt(i)).equals(compareWith)) {
                cnt++;
            }
            //다르면
            if (!String.valueOf(str.charAt(i)).equals(compareWith)) {
                //result 에 compareWith 를 추가한다
                result.append(compareWith);
                //1은 생략되므로 1이생일때 뒤에 숫자를 추가해 추가된 글자의 수를 나타낸다
                if (cnt > 1) {
                    result.append(cnt);
                }
                //i 번째 글자가 compareWith 와 달랐으므로 i 번째 글자를 비교글자로 바꾼다
                compareWith = str.charAt(i) + "";
                //다시 cnt를 1로 만든다
                cnt = 1;
            }
        }
        System.out.println("result = " + result);
    }
}

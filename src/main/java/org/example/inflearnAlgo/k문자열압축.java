package org.example.inflearnAlgo;

import java.util.Scanner;

public class k문자열압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + "#";
        String compareWhit = "";
        StringBuilder result = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(compareWhit)) {
                cnt++;
            }
            if (!String.valueOf(str.charAt(i)).equals(compareWhit)) {
                result.append(compareWhit);
                if (cnt > 1) {
                    result.append(cnt);
                }
                compareWhit = str.charAt(i) + "";
                cnt = 1;
            }
        }
        System.out.println("result = " + result);
    }
}

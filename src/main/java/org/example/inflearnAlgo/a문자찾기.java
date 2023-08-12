package org.example.inflearnAlgo;

import java.util.Scanner;

public class a문자찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (String.valueOf(s1.charAt(i)).equals(s2.toLowerCase())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

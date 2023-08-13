package org.example.inflearnAlgo;

import java.util.ArrayList;
import java.util.Scanner;

public class f중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String target = str.charAt(i) + "";
            if (target.matches("[a-zA-Z]")) {
                sb.append(target);
                str = str.replace(target, "0");
            }
        }
        System.out.println(sb);
    }
}

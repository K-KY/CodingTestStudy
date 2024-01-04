package org.example.inflearnAlgo.stack.que;

import java.util.List;
import java.util.Scanner;

public class 올바른괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int open = 0;
        int close = 0;
        List<String> brackets = List.of(sc.nextLine().split(""));

        for (int i = 0; i < brackets.size(); i++) {
            if (brackets.get(i).equals("(")) {
                open++;
            }
            if (brackets.get(i).equals(")")) {
                close++;
            }
            if (close > open) {
                break;
            }
        }

        System.out.println(open);
        System.out.println(close);
        if (open != close) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

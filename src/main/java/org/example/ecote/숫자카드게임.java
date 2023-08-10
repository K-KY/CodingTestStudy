package org.example.ecote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hor = sc.nextInt();
        int ver = sc.nextInt();
        int min = 999;
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < hor; i++) {
            for (int j = 0; j < ver; j++) {
                int num = sc.nextInt();
                if (min > num) {
                    min = num;
                }
            }
            result = Math.max(min, result);
            arr.add(min);
            min = 999;
        }
        Arrays.sort(args);
        System.out.println("arr.get(arr.size() - 1) = " + arr.get(arr.size() - 1));
        System.out.println("result = " + result);
    }
}

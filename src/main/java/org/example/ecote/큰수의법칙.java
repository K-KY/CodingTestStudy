package org.example.ecote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 큰수의법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int plusLimit = sc.nextInt();
        int dupleLimit = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrLength; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        int first = arr.get(arrLength - 1); // 가장 큰 수
        int second = arr.get(arrLength - 2); // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (plusLimit / (dupleLimit + 1)) * dupleLimit;
        // 666 5 666 5  6= 9 / 4 * 3 = 6
        //더하는 횟수 / (중복제한 + 1) * 중복제한
        //같은 배열이 두번 반복된다 따라서 같은 배열길이 나누기 더하는 횟수 를 하면 같은 배열의 수가 나온다 + 1을 하는 이유는 중복제한만큼 더하고 두번 째 큰 수를 더해줘야 하기때문
        //거기에 중복제한을 곱하면 가장 큰 수의 갯수가 나온다
        cnt += plusLimit % (dupleLimit + 1);
        //나누어 떨어지지 않았을 경우를 대배 더하는 횟수 % 같은 배열의 길이 를 하면 나머지 가 나온다
        //cnt 에 나머지를 더한다
        // 9 % 4 = 1
        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (plusLimit - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println("cnt = " + cnt);

        System.out.println("sum = " + result);
    }
}

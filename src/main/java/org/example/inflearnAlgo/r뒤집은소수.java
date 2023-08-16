package org.example.inflearnAlgo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*설명
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

입력된 스트링을 거꾸로 뒤집는다

소수 리스트를 만들어 리턴
스트링 토크나이저로 하나씩 비교하면서 일치하면 출력
*/
public class r뒤집은소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cycle = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(flip(sc.nextLine()));
        ArrayList<Integer> arr = numList();

        String result = "";
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if  (arr.contains(num)) {
                result = num + " " + result;
            }
        }
        System.out.println(result);

    }
    static ArrayList<Integer> numList() {
        int[] num = new int[100000 + 1];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= num.length - 1; i++) {
            if (num[i] == 0) {
                arr.add(i);
                for (int j = i; j <= num.length - 1; j+=i) {
                    num[j] = 1;
                }
            }
        }
        return arr;
    }
    static String flip(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - (i + 1)));
        }
        return sb.toString();
    }
}

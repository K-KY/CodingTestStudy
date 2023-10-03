package org.example.inflearnAlgo.hash;

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;

/**
 * 설명
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
 * <p>
 * 각 구간별로 구하라고 했습니다.
 * <p>
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 * <p>
 * 20 12 20 10 23 17 10
 * <p>
 * 각 연속 4일간의 구간의 매출종류는
 * <p>
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 * <p>
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 * <p>
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 * <p>
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 * <p>
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 * <p>
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 * <p>
 * <p>
 * 출력
 * 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
 */
public class 매출액종류 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        int days = 0;
        int windows = 0;
        while (st.hasMoreTokens()) {
            days = Integer.parseInt(st.nextToken());
            windows = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bw.readLine());
        int cnt = 0;
        while (st.hasMoreTokens()) {
            int k = Integer.parseInt(st.nextToken());
            hashMap.put(k, hashMap.getOrDefault(k, 0) + 1);
            arr.add(k);
            cnt++;
            if (cnt >= windows) {
                sb.append(hashMap.size()).append(" ");
                hashMap.put(arr.get(0), hashMap.getOrDefault(arr.get(0), 0) - 1);
                if (hashMap.get(arr.get(0)) <= 0) {
                    hashMap.remove(arr.get(0));
                }
                    arr.remove(0);

            }
        }
        System.out.println(sb);
    }
}

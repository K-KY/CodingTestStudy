package org.example.inflearnAlgo.twopointerslidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
* 설명
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

12 15 11 20 25 10 20 19 13 15

연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

여러분이 현수를 도와주세요.


입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.

두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.


출력
첫 줄에 최대 매출액을 출력합니다.
0부터 length까지
i 부터 i + k 만큼 합을 구함
int max 를 0으로 선언하고
math.max(sum, max) 로 최대 매출을 구한

*/
public class 최대매출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        int section = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;
        int start = 0;
        ArrayList<Integer> earned = new ArrayList<>();
        while(st.hasMoreTokens()) {
            earned.add(Integer.parseInt(st.nextToken()));
        }
        //max - arr(start) + arr(end)
        for (int i = 0; i < days; i++) {
            sum += earned.get(i);

            //section 이 3 일 때 section - 1 = 2 sum = arr(0, 1, 2)
            if (i >= section - 1) {
                max = Math.max(sum, max);
                sum -= earned.get(start);
                start++;
            }
        }
        System.out.println(max);
    }
}

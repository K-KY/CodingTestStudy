package org.example.inflearnAlgo.twopointerslidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*설명
N개의 수로 이루어진 수열이 주어집니다.

이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

만약 N=8, M=6이고 수열이 다음과 같다면

1 2 1 3 1 1 1 2

합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.


입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.

수열의 원소값은 1,000을 넘지 않는 자연수이다.

8 6
1 2 1 3 1 1 1 2



출력
첫째 줄에 경우의 수를 출력한다.
start 지점을 0
end 는 0 부터 계속 ++
sum 을 1 부터 끝까  m 과 같거나 커질 때까지 더한다
sum = m 이라면 end++ start++
sum > m 이라면 start++

*/
public class 연속부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int sum = 0;
        int start = 0;
        int result = 0;
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        //수열 입력

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            while (sum > limit) {
                sum -= arr.get(start);
                start++;
            }
            if (sum == limit) {
                result++;
            }
            System.out.println("sum = " + sum);
        }
        System.out.println("result = " + result);
    }
}

package org.example.inflearnAlgo.twopointerslidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*설명
0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.

만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면

1 1 0 0 1 1 0 1 1 0 1 1 0 1

여러분이 만들 수 있는 1이 연속된 연속부분수열은

Image1.jpg

이며 그 길이는 8입니다.


입력
첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.

두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.


출력
첫 줄에 최대 길이를 출력하세요.


*/
public class 최대길이연속부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int change = Integer.parseInt(st.nextToken());
        int max = 0;
        int start = 0;
        int[] arr = new int[length + 1];
        int cnt = 0;
        ArrayList<Integer> indexOfZero = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                indexOfZero.add(i);
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                cnt++;
            }
            if (arr[i] == 0 && change != 0) {
                arr[i] = 1;
                change--;
                cnt++;
            }
            if (arr[i] == 0 && change == 0) {
                arr[indexOfZero.get(start)] = 0;
                max = Math.max(cnt, max);
                if (start == 0) {
                    System.out.println("cnt = " + cnt);
                    cnt -= indexOfZero.get(start) + 1;
                }
                if (start != 0) {
                    System.out.println("cnt = " + cnt);
                    cnt -=  ((indexOfZero.get(start)) - (indexOfZero.get(start - 1)));
                }
                System.out.println("max = " + max);
                start++;
                change++;
                i--;

            }
        }
        System.out.println("max = " + max);
    }
}


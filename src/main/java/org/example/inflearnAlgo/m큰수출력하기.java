package org.example.inflearnAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

i 와 i - 1 을 비교한다 - > Math.Max 로 i 가 0 보다 클 때

*/
public class m큰수출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int prev = 0;
        int cycle = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cycle; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        //여기까지 입력받은 수를 어레이에 저장

        for (int i = 0; i < arr.size(); i++) {
            int max = 0;
            if (i == 0) {
                max = Math.max(prev, arr.get(i));
                result.append(max);
                prev = arr.get(i);
                continue;

            }

            max = Math.max(arr.get(i), prev);
            prev = arr.get(i);
            if (max == arr.get(i)) {
                result.append(" ").append(max);
            }

        }
        System.out.println("result = " + result);
    }
}

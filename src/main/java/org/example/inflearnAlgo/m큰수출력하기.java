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
            //만약 i 가 0이라면 -1 번쨰는 없으므로 0과 비교해 큰 숫자를 prev 에 넣는다
            //0과 비교해 나온 max 는 result 에 추가
            //아래 코드는 실행되지않게 continue
            if (i == 0) {
                max = Math.max(prev, arr.get(i));
                result.append(max);
                prev = arr.get(i);
                continue;

            }
            //i 가 0이 아니라면 prev 에는 i - 1 번째 인덱스값이 저장되어 있을거다
            //i 번째와 i -1 번째를 비교해 큰 값을 얻는다
            max = Math.max(arr.get(i), prev);
            //더 큰 값을 얻었으면 다음 값과 비교하기 위해 prev 를 현재 인덱스 값으로 저장한다
            prev = arr.get(i);
            //max 가 i 랑 같다는건 이전값과 현재값을 비교했을때 현재값이 더 크다는 의미
            //따라서 result 에 추가한다
            if (max == arr.get(i)) {
                result.append(" ").append(max);
            }

        }
        System.out.println("result = " + result);
    }
}

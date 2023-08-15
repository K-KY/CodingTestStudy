package org.example.inflearnAlgo;

import javax.print.attribute.standard.OrientationRequested;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*설명
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


출력
선생님이 볼 수 있는 최대학생수를 출력한다.

앞에서부터 가장 큰 학생을 저장한다
저장된 학생보다 크면 카운트 +1 작으면 무시
*/
public class n보이는학생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stdNum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int scope = 0;
        int tallStd = 0;

        for (int i = 0; i < stdNum; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > tallStd) {
                tallStd = arr.get(i);
                scope++;
            }
        }
        System.out.println(scope);

    }
}

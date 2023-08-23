package org.example.inflearnAlgo.twopointerslidingwindow;

import java.beans.Introspector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*설명
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.

두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.

네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

각 집합의 원소는 1,000,000,000이하의 자연수입니다.


출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.


5
1 3 9 5 2
5
3 2 5 7 8

해쉬맵에 입력받은 배열을 넣는다
넣을 때마다 1씩 추가한다
해쉬맵에서 1 이상인 key를 라스트에 넣는다
정렬후 스트랑발더에 추가해 출력한다
*/
public class z공통원소구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> check = new HashMap<>();
        //배열 넣을 해쉬맵
        int length = Integer.parseInt(br.readLine());
        //배열 길이 재활용 할거임
        List<Integer> keys = new ArrayList<>();
        //값이 1 이상인 key 를 넣음
        StringTokenizer st = new StringTokenizer(br.readLine());
        //배열 입력받음
        StringBuilder sb = new StringBuilder();
        //1이상인거 여기다 추가

        for (int i = 0; i < length; i++) {
            int key = Integer.parseInt(st.nextToken());
            check.put(key , check.getOrDefault(key, 0) + 1);
            //해쉬맵엔 아무것도 안들어있는 상태니까 디폴트 0
        }
        length = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int key = Integer.parseInt(st.nextToken());
            check.put(key , check.getOrDefault(key, 0) + 1);
        }
        //forEach 로 key 넣기
        check.forEach((key, value) -> {
            if (value > 1) {
                keys.add(key);
            }
        });

        //정렬
        Collections.sort(keys);

        //빌더에 추가
        for (int i = 0; i < keys.size(); i++) {
            sb.append(keys.get(i)).append(" ");
        }
        //출력
        System.out.println("check = " + check);
        System.out.println("sb = " + sb);
    }
}

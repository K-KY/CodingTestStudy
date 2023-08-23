package org.example.inflearnAlgo.twopointerslidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*설명
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력
오름차순으로 정렬된 배열을 출력합니다.

스트링빌더에 모든값을 넣는다
스플릿으로 나눈다
정렬한다
출력한다


*/
public class y두배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        //입력받은 모든 숫자를 집어넣을 빌더

        int length = Integer.parseInt(sc.next());
        //입력받은 값을 스트링빌더에 집어넣음
        for (int i = 0; i < length; i++) {
            sb.append(sc.next()).append(" ");
        }
        length = Integer.parseInt(sc.next());
        for (int i = 0; i < length; i++) {
            sb.append(sc.next()).append(" ");
        }
        String[] arr = sb.toString().split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(Integer.parseInt(arr[i]));
        }
        sb.delete(0 , sb.length());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arr[i] = " + arr[i]);
            sb.append(arrayList.get(i)).append(" ");
        }
        System.out.println(sb);


    }
}

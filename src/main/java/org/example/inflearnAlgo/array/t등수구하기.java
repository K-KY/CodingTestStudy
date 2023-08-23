package org.example.inflearnAlgo.array;

import java.util.*;

/*설명
N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.

같은 점수가 입력될 경우 높은 등수로 동일 처리한다.

즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.


입력
첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.


출력
입력된 순서대로 등수를 출력한다.


*/
public class t등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(Integer.parseInt(sc.next()));
        }

        for (int i = 0; i < arr.size(); i++) {
            int rank = 1;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j) && j != i) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }


    }
}

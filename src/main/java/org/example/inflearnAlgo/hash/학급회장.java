package org.example.inflearnAlgo.hash;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**1. 학급 회장(해쉬)
설명
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.


입력
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.

두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.

 학생수 입력받기
 문자열 입력받기
 나누기
 해쉬에 넣고 나온 갯수대로 +1

출력
*/
public class 학급회장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stdNum = Integer.parseInt(sc.next());
        String[] vote = sc.next().split("");
        HashMap<String, Integer> result = new HashMap<>();
        String answer = "";
        int max = 0;
        for (int i = 0; i < vote.length; i++) {
            result.put(vote[i], result.getOrDefault(vote[i] , 0) + 1);

            if (max < result.get(vote[i])) {
                max = result.get(vote[i]);
                answer = vote[i];
            }

        }
        System.out.println(answer);
    }
}

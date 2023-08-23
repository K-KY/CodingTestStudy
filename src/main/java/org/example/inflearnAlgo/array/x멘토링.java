package org.example.inflearnAlgo.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*설명
현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.

멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.

선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.

만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.

M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.

두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.

만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.


출력
4 3
3 4 1 2
4 3 2 1
3 1 4 2
3 = 1, 2
4 = 2

20 10
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4
7 16 8 20 14 1 5 3 15 2 10 11 9 17 19 6 13 12 18 4



한 번이라도 n 번 학생의 앞에 있는 학생을 지운다
*/
public class x멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stds = Integer.parseInt(sc.next());//hor
        int tests = Integer.parseInt(sc.next());//ver
        int result = 0;
        ArrayList<Integer> scores = new ArrayList<>();
        HashMap<Integer, int[]> hash = new HashMap<>();
        //여기엔 각 학생별로 key 값으로 배열을 넣고 한번도 앞지른적이 없으면 1로 체크한다
        //어레이에 학생들 점수 넣기
        for (int i = 0; i < tests; i++) {
            for (int j = 0; j < stds; j++) {
                scores.add(Integer.parseInt(sc.next()));
            }
        }

        for (int i = 0; i < scores.size(); i++) {
            int[] score = hash.getOrDefault(scores.get(i), new int[stds]);
            for (int j = 0; j < stds; j++) {
                // 1 / 5 = 0 , 0 * 5 = 0
                // 6/ 5 = 1 , 1 * 5 = 5
                if (i < (i / stds) * stds + j) {
                    //여긴 그냥 아무것도 안함
                }
                if (i > (i / stds) * stds + j) {
                    //여기에 한번이라도 앞지른적 있는 번호를 넣는 로직
                    System.out.println("i = " + i);
                    System.out.println("(i / stds) * stds + j = " + ((i / stds) * stds + j));
                    System.out.println(scores.get((i / stds) * stds + j));
                    System.out.println("scores.get(i) = " + scores.get(i));
                    score[scores.get(i / stds * stds + j) - 1] = 1;
                    hash.put(scores.get(i), score);
                }

            }
        }
        System.out.println("hash = " + hash);
        for (int i = 1; i <= hash.size(); i++) {//여기서 hash.size() 로 했더니 반례가 나왔음
            //가설 1 7 이 한 번도 앞질로 진 적이 없어서 hash 에 들어가질 않음 - > 기본으로 new int[stds] 를 가져오기 떄문에 7이 안 들어가있어도 0으로 채워진 배열이 나옴
            //가설 2 hash.size() 가 7이 hash에 안들어가서 19이기 때문에 1 ~ 19 만 카운트 하고 20은 카운팅 안됨 -> 이게 맞음 오답 = 174, 20을 카운팅했을 때 + 16으로 190 정답이 나옴
            //다른건 왜 정답인가? -> 다른건 앞질러진 번호가 있기때문에 hash에 들어감 그래서 hash.size() == stds 가 성립 근데 두번째 케이스에선 7 hash에 들어가지 않기 때문에 오답이 나옴
            System.out.println("i = " + i);
            System.out.println("hash.size() = " + hash.size());
            for (int j = 0; j <stds; j++) {
                System.out.println("hash.get(i)[j] = " + hash.getOrDefault(i, new int[stds])[j]);
                if (i != j + 1 && hash.getOrDefault(i, new int[stds])[j] == 0) {
                    result++;
                }
            }
        }
        System.out.println("result = " + result);
    }
}

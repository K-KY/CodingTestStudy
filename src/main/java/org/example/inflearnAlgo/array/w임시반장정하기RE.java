package org.example.inflearnAlgo.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*설명
김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.

김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.

그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.

그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.

예를 들어 학생 수가 5명일 때의 표를 살펴보자.

5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2

5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2

위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학년 때 같은 반이었으며,

2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도

같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모두 3명이다.

이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.

각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.


입력
첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.

둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.

주어지는 정수는 모두 1 이상 9 이하의 정수이다.


출력
첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.

단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.

해야되는것 :
학년당 같은 반이 되었던 학생수를 구하는것이 아니라
학생 1이 같은반이 되었던 학생의 수를 구해야함
학생 1 = 0 0 0 0 0; 각 값은 n번째 학생과 같은 반이 된 수를 의미함

arr.size() 만큼 포문
중첩 포문으로 i부터 끝까지 5의 배수로 탐색 -> 0 5 10 15
같은 숫자가 있다면 i / 5 에 + 1 -> 0 1 2 3 4 까지 5개 는 5로 나눴을 때 0, 5 6 7 8 9 는 5로 나눴을 때 1이다 소수점이 없어지기 떄문
*/
public class w임시반장정하기RE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stds = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, int[]> hash = new HashMap<>();

        //학생 수만큼 반복한다
        for (int i = 0; i < stds; i++) {
            //1 ~ 5 까지 니까 5번 반복
            for (int j = 0; j < 5; j++) {
                arr.add(Integer.parseInt(sc.next()));
            }
        }
        // 학생의 과거 배정받은 반
        
        //n 번 학생과 같은반이 된적이 있으면 1 없으면 0 으로 체크
        for (int i = 0; i < arr.size(); i++) {
            //세로로 같은 번호를 체크해야함 = i % 5

            // i % 5 = 0 1 2 3 4 = 0 1 2 3 4, 5 6 7 8 9 = 0 1 2 3 4
            // j+=5 = 0 5 10..., 1 6 11..., 2 7 12 ...
            //i 가 몇이든 0 1 2 3 4
            for (int j = i % 5; j < arr.size(); j+=5) {

                // 탐색 하면서 arr(i) == arr(j) 일 때
                if (arr.get(i) == arr.get(j) && i != j) {
                    System.out.println("j = " + j);
                    System.out.println("i = " + i);
                    //hash 에 들어있는건 학생의 번호 i = 0, j = 0, 5, 10... j/5 = 0 , 1 , 2
                    int [] result = hash.getOrDefault(j / 5, new int[stds]);

                    result[i / 5] += 1; // i = 0 1 2 3 4 일 때 0번째 5 6 7 8 9 일 때 1 에 넣는다

                    for (int k = 0; k < result.length; k++) {
                        System.out.println("result[k] = " + result[k]);
                    }

                    hash.put(j / 5, result);
                    //j / 5 에서 꺼냈으니 다시 j / 5 에 넣는다

                }

            }
            System.out.println("hash = " + hash);
        }
        int result = 0;
        //0이 가장 큰 값을 가진 key
        int max = 0;
        //0 이 아닌 값의 수 중 가장 큰 값
        //0이 아닌 수를 전부 센다
        for (int i = 0; i < stds; i++) {
            int[] a = hash.getOrDefault(i, new int[stds]);
            //a 에 i 번 학생의 배열을 저장
            int nz = 0;
            System.out.println("i = " + i);

            for (int j = 0; j < stds; j++) {
                //만약 0 이 아니면 nz++;
                if (a[j] != 0) {
                    nz++;
                }
                System.out.println("a[j] = " + a[j]);
            }
            //nz 가 max 보다 크면 nz = max
            if (nz > max) {
                max = nz;
                result = i;
            }
        }
        System.out.println("result = " + result);
    }
}

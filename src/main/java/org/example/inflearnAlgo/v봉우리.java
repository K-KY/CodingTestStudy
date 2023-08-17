package org.example.inflearnAlgo;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.

각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.

격자의 가장자리는 0으로 초기화 되었다고 가정한다.

만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2

6
5 3 7 2 3 6
3 7 1 6 1 4
7 2 5 3 4 2
4 3 6 4 1 1
8 7 3 5 2 8
2 5 2 7 3 2

-N
+N
-1
+1 이 전부 arr[i] 보다 작다면 봉우리로 카운트
가장자리의 경우 i - n 이 0보다 작으면 0 으로
0보다 크면 square * i
*/
public class v봉우리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        int square = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                arr.add(Integer.parseInt(sc.next()));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            int up = 0;
            int down = 0;
            int left = 0;
            int right = 0;
            int target = arr.get(i);
            // i % square 가 0 일 때 -1 = 0
            // (i + 1) % square 가 0 일 때 +1 = 0
            // i - square < 0 이면 0
            // i + square > arr.size() - 1 이면 = 0
            if (i - square > 0) {
                up = arr.get(i - square);
            }
            if (i + square < arr.size()) {
                down = arr.get(i + square);
            }
            if (i % square != 0) {
                left = arr.get(i - 1);
            }
            if ((i + 1) % square != 0) {
                right = arr.get(i + 1);
            }
/*
            System.out.println("up = " + up);
            System.out.println("down = " + down);
            System.out.println("left = " + left);
            System.out.println("right = " + right);
*/

            if (target > up && target > down && target > left && target > right) {
                result++;
            }

        }
        System.out.println(result);
    }
}

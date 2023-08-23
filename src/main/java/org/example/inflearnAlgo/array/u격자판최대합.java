package org.example.inflearnAlgo.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/*설명
5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

5
75 74 72 24 55
29 38 48 56 12
93 58 15 13 10
11 22 33 44 42
55 66 77 88 47

75 74 72 24 55 98
29 38 48 56 12 74
93 58 15 13 10 69
11 22 33 44 42 12
55 66 77 88 47 18
64 83 42 50 38 99
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
*/
public class u격자판최대합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int square = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                arr.add(Integer.parseInt(sc.next()));
            }
        }
        int sum = 0;
        //horizontal
        for (int i = 1; i <= arr.size(); i++) {
            sum += arr.get(i - 1);
            if (i % (square) == 0) {
                sums.add(sum);
                sum = 0;
            }


        }
        System.out.println("arr = " + sums);

        //vertical
        for (int i = 1; i <= square; i++) {
            for (int j = i; j <= arr.size(); j += square) {
                sum += arr.get(j - 1);
            }
            sums.add(sum);
            sum =0;
        }
        System.out.println("arr = " + sums);

        //cross 1 7 13 18 ...
        for (int i = 0; i < square; i++) {
            if (i == 0) {
                sum += arr.get(0);
                continue;
            }
            sum += arr.get(square * i + i);
            System.out.println("square = " + arr.get(square * i + i));
        }
        sums.add(sum);
        sum = 0;
        System.out.println("arr = " + sums);

        //back cross
        for (int i = square; i < arr.size(); i+=(square - 1)) {
            sum += arr.get(i - 1);
            System.out.println("arr.get(i) = " + arr.get(i - 1));;
        }
        sums.add(sum);
        System.out.println("arr = " + sums);

        int max = sums.stream().max(Comparator.comparing(x -> x)).get();
        System.out.println(max);
    }



}

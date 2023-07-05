package org.example.doitBook;

import java.util.Scanner;

public class backJun2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 1;
        int count = 0;
        int sum = 0;
        int end = 0;
        int complex = 0;
        for (int i = 1; i <= num; ) {
            complex++;
            if (end < i) {
                end = i;
                sum += i;
            }
            if (sum < num) {
                i++;
            }
            if (sum == num) {
                i++;
                count++;
            }
            if (sum > num) {
                sum -= start;
                start++;

            }
        }
        System.out.println("count = " + count);
        System.out.println("complex = " + complex);
    }


//        //1부터  N 까지
//        ArrayList<Integer> arr = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        int start = 0;
//        int count = 0;
//        int complex = 0;
//
//        //왜 start 를 0 이 아니라 1 로 하면 3이 나오는지 증명하기
//        for (int i = 0; i <= num; i++) {
//            sum+=i;
//            arr.add(sum);
//        }
//        for (int i = 1; i <= num;) {
//            int  n = arr.get(i) - arr.get(start);
//            if (n < num) {
//                i++;
//            }
//            if (n == num) {
//                i++;
//                count++;
//            }
//            if (n > num) {
//                start++;
//            }
//        }
//
//        System.out.println("count = " + count);


}
/*
어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다.
이때, 사용하는 자연수는 N이하여야 한다.

예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.

N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.

*/
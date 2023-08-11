package org.example.ecote;

import java.util.Scanner;

public class 일이될때까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int numV2 = num;
        int divider = sc.nextInt();
        int cnt = 0;
        int cntV2 = 0;

        System.out.println("num / divider * divider = " + num / divider * divider);
        cntV2 += remain(num, divider);
        numV2 -= remain(num, divider);
        while(numV2 >= divider) {
            if (remain(numV2, divider) != 0) {
                cntV2 += remain(numV2, divider);
                numV2 -= remain(numV2, divider);
            }
            numV2 = divide(numV2, divider);
            cntV2++;
        }
        cntV2 += numV2 - 1;
        numV2 -= numV2 -1;
        System.out.println("---------------------------------------");
        System.out.println("numV2 = " + numV2);
        System.out.println("cntV2 = " + cntV2);

        Scanner sc2 = new Scanner(System.in);

        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc2.nextInt();
        int k = sc2.nextInt();
        int result = 0;

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);
        sc.close();
        sc2.close();
    }
//17 3 = 17 - 2, 15/3 5 - 2 3 / 3 = 1
    //17 4 =
    static int divide(int num, int divider) {
        return (int) Math.ceil((double) num / divider);
    }

    static int remain(int num, int divider) {
        return num % divider;
    }
}

package org.example.inflearnAlgo.array;

import java.util.Scanner;

/*설명
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력
첫 줄에 피보나치 수열을 출력합니다.


*/
public class p피보나치수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        int[] arr = new int[cycle];
        int pip = 1;

        for (int i = 0; i < cycle; i++) {
            //앞에 두 자리 이하로 있을땐 그대로 집어넣는다
            if (i < 2) {
                arr[i] = pip;
                System.out.println(arr[i]);
            }
            //두자리 이상 있을 땐 i 를 제외한 앞의 두 자리를 더한다
            if (i >= 2 ) {
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.println(arr[i]);
            }
        }
    }
}

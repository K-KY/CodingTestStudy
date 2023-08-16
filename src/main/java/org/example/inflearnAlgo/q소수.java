package org.example.inflearnAlgo;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.

소수란? 1과 자기 자신말고 나누어지는 수가 없는것을 뜻한다

*/
public class q소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        int[] arr = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            if (arr[i] == 0) {
                answer++;

                for (int j = i; j <= num; j+=i) {
                    arr[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }







    //시간초과
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        int zero = 0;
        //i 가 2부터 시작하지만 2는 포문이 돌지 않는다
        //i 가 2일 때  j 도 2부터 시작하고  j 는 i 보다 작아야 하는것이 두번쨰 포문의 조건이다 j 가 i 보다 크거나 같으므로 두번째 포문은 수행되지 않는다
        for (int i = 2; i <= num; i++) {
            zero = 0;
            for (int j = 2; j < i; j++) {
                //만약 1과 i 를 제외한 숫자로 나눈 나머지가 0이라면 그 숫자는 소수가 아니다
                if (i % j == 0) {
                    zero++;
                    //if 문에 진입한걸 확인하기 위한 값
                    break;
                    //소수가 아닌게 확실하니 뒤의 숫자는 더이상 확인할 필요가 없음
                }
            }
            //0 이라면 1 과 i 를 제외한 어떤 숫자와도 나누어지지 않았다는 의미
            if (zero == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
*/
}

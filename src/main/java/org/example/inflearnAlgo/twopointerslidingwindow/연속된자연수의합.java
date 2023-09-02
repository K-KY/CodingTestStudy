package org.example.inflearnAlgo.twopointerslidingwindow;

import java.util.Scanner;

/*설명
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

만약 N=15이면

7+8=15

4+5+6=15

1+2+3+4+5=15

와 같이 총 3가지의 경우가 존재한다.


입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.


출력
첫 줄에 총 경우수를 출력합니다.

숫자를 입력받는다
입력된 숫자만큼 반복해서 더한다
입력된 숫자랑 합이 같아지면 result++
합이 입력된 숫자보다 크면 start 만큼 빼고 start++
*/
public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        //합 값
        int result = 0;
        //결과 값
        int start = 1;
        //뒤에서부터 차례로 뺄 값
        for (int i = 1; i < num;) {
            //sum 괴 num  이 같으면 결과값을++ 해주고 start 를 빼고 start++
            if (sum == num) {
                result++;
                sum -= start;
                start++;
            }
            //이미 같은 경우를 위에서 반영 했기때문에 같을때도 더한다
            if (sum <= num) {
                sum += i;
                i++;
            }
            //sum 이 num 보다 크면 start를 빼고 start++
            if (sum > num) {
                sum -= start;
                start++;
            }
        }
        System.out.println("result = " + result);
    }
}

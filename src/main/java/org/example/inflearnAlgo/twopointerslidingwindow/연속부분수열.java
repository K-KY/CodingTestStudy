package org.example.inflearnAlgo.twopointerslidingwindow;
/*설명
N개의 수로 이루어진 수열이 주어집니다.

이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

만약 N=8, M=6이고 수열이 다음과 같다면

1 2 1 3 1 1 1 2

합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.


입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.

수열의 원소값은 1,000을 넘지 않는 자연수이다.


출력
첫째 줄에 경우의 수를 출력한다.
start 지점을 0
end 는 0 부터 계속 ++
sum 을 1 부터 끝까  m 과 같거나 커질 때까지 더한다
sum = m 이라면 end++ start++
sum > m 이라면 start++

*/
public class 연속부분수열 {
    public static void main(String[] args) {

    }
}

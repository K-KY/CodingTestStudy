package org.example.inflearnAlgo.array;

import java.util.Scanner;

/*설명
A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

예를 들어 N=5이면

Image1.jpg

두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.

세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

두 수의 차가 1이라면 큰 쪽이 이김
두 수의 차가 2라면 큰 쪽이 짐
두 수의 차가 0이라면 비김
*/
public class o가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = Integer.parseInt(sc.nextLine());

        String[] arrA = sc.nextLine().split(" ");
        String[] arrB = sc.nextLine().split(" ");

        for (int i = 0; i < games; i++) {
            int result = Integer.parseInt(arrA[i]) - Integer.parseInt(arrB[i]);
            //양수라면 A가 이김 음수라면 B가 이김 2 또는 -2 일떄는 예외로 반대

            //두 수의 차가 양수니까 왼쪽이 이김
            if (result == 1) {
                System.out.println("A");
            }
            //두 수의 차가 음수니까 오른쪽이 이김
            if (result == -1) {
                System.out.println("B");
            }
            //가위와 보 일때는 1 - 3 or 3 - 1 이고 작은쪽이 이긴다
            //양수가 나왔으니 B가 이김
            if (result == 2) {
                System.out.println("B");
            }
            //음수가 나왔으니 A가 이김
            if (result == -2) {
                System.out.println("A");
            }
            //두 수의 차가 0이면 둘이 같은걸 낸거임
            if (result == 0) {
                System.out.println("D");
            }

        }
    }
}

package org.example.inflearnAlgo.hash;

import java.util.*;
import java.util.stream.Collectors;

/*5. K번째 큰 수
설명
현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.

현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.

기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.

만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.


입력
첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.


출력
첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.


10 3
13 15 34 23 45 65 33 11 26 42


*/
public class K번째큰수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> sumSet = new TreeSet<>();
        int cardQuantity = Integer.parseInt(sc.next());
        int answerPosition = Integer.parseInt(sc.next());
        sc.nextLine();
        List<Integer> numbers = Arrays.asList(sc.nextLine().split(" ")).stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            int iValue = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                int jValue = numbers.get(j);
                for (int k = j + 1; k < numbers.size(); k++) {
                    int kValue = numbers.get(k);
                    sumSet.add(iValue + jValue + kValue);
                }
            }
        }

        System.out.println(numbers);

        System.out.println(sumSet.stream().sorted(Collections.reverseOrder()).toList());
        System.out.println(answerPosition);
        System.out.println(pick(sumSet, answerPosition));

    }

    public static Integer pick(Set<Integer> sumSet, int answerPosition) {
        if (answerPosition >= sumSet.size()) {
            return -1;
        }
        return sumSet.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(answerPosition - 1);
    }
}
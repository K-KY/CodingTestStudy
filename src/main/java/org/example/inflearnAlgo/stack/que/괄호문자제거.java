package org.example.inflearnAlgo.stack.que;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 2. 괄호문자제거
 * 설명
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * 남은 문자만 출력한다.
 *
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)  -> EFLM
 *
 * 입력을 한글자씩 나눈다
 * 여는 괄호는 스택에 넣을거임 - stack{(,(,(}
 * 닫는 괄호가 나오면 스택에 있는거 하나 지움
 */
public class 괄호문자제거 {
    public static void main(String[] args) {
        Queue<String> answer = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        List<String> target =  List.of(sc.nextLine().split(""));
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < target.size(); i++) {
            if (target.get(i).equals("(")) {
                stack.push(target.get(i));
            }
            if (stack.size() == 0) {
                answer.offer(target.get(i));
            }
            if (target.get(i).equals(")")) {
                stack.pop();
            }
        }

        answer.forEach(System.out::print);
    }
}

package org.example.inflearnAlgo.hash;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 4. 모든 아나그램 찾기
 * 설명
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * <p>
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * <p>
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 * <p>
 * <p>
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 * <p>
 * <p>
 * bacaAacba
 * abc
 * <p>
 * 3
 * <p>
 * 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 * <p>
 * 해쉬맵에 문자열S를 index, value 로 넣는다. -> 0 , b 1, a
 * T의 길이만큼 hash 에서 가져온다
 */
public class 모든아나그램구하기 {
    private static final Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Map<String, Integer> answerMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        List<String> sLit = Arrays.stream(sc.nextLine().split("")).collect(Collectors.toList());

        List<String> tLit = Arrays.asList(sc.nextLine().split(""));
        for (String s : tLit) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        while (sLit.size() >= tLit.size()) {
            answerMap.clear();
            for (int i = 0; i < tLit.size(); i++) {
                answerMap.put(sLit.get(i), answerMap.getOrDefault(sLit.get(i), 0) + 1);
            }
            sLit.remove(0);
            if (map.equals(answerMap)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

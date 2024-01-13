package org.example.inflearnAlgo;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = Integer.parseInt(sc.nextLine().split(" ")[0]);
        List<String> numbers = Arrays.asList(sc.nextLine().split(" "));
        int numberLength = numbers.size();
        StringJoiner answer = new StringJoiner(" ");
        Set<String> answers = new LinkedHashSet<>();
            while(answers.size() < range) {
                answers.add(numbers.get(numberLength - 1));
                numberLength--;
            }

        answers.forEach(x -> answer.add(x));
        System.out.println(answer);
    }
}
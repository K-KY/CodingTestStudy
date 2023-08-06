package org.example.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAndStringVoca {
    public static void main(String[] args) {
        NumberAndStringVocaSolution s = new NumberAndStringVocaSolution();
        System.out.println(s.solution("twozerotwo"));
    }
}

class NumberAndStringVocaSolution {
    public int solution(String s) {
        int answer = 0;
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numStr.length; i++) {
            s = s.replace(numStr[i], String.valueOf(i));
        }


        StringBuffer sb = new StringBuffer();
        sb = sb.append(numStr[1]);
        List<Integer> lst = new ArrayList<>();
        Collections.sort(lst);

        answer = Integer.parseInt(s);
        return answer;
    }
}

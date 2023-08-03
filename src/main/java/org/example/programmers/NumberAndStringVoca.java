package org.example.programmers;

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
        answer = Integer.parseInt(s);
        return answer;
    }
}

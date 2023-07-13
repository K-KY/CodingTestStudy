package org.example.programmers;

public class Trio {
    public static void main(String[] args) {
        SolutionTrio solutionTrio = new SolutionTrio();
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solutionTrio.solution(number));
    }
}

class SolutionTrio {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}


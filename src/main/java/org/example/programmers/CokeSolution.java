package org.example.programmers;

public class CokeSolution {


    public static void main(String[] args) {
        SolutionCoke solutionCoke = new SolutionCoke();
        System.out.println("solutionCoke = " + solutionCoke.solution(4, 3, 23));
    }
}

class SolutionCoke {
    SolutionCoke() {
    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        int pocket = 0;
        while(n >= a) {
            if(n % a != 0) {
                pocket += n % a;
            }
            n = n / a * b;

            answer += n;
            if(n < a) {
                n += pocket;
                pocket = 0;
            }
        }
        return answer;
    }
}

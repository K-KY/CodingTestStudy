package org.example.programmers;

import java.util.HashMap;

public class KBTI {
    public static void main(String[] args) {
        SolutionKBTI solutionKBTI = new SolutionKBTI();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solutionKBTI.solution(survey, choices));
    }
}
class SolutionKBTI {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> result = new HashMap<>();
        String[] cases = {"RT", "CF", "JM", "AN"};
        for(int i = 0; i < survey.length; i++) {
            if (choices[i] > 4) {
                String sur = survey[i].charAt(1)+"";
                result.put(sur, result.getOrDefault(sur, 0) + choices[i] -4 );
            }
            if (choices[i] < 4) {
                String sur = survey[i].charAt(0)+"";
                result.put(sur, result.getOrDefault(sur, 0) + 4 - choices[i] );
            }
            if (choices[i] == 4) {
                String sur = survey[i].charAt(0)+"";

                result.put(sur, result.getOrDefault(sur, 0) + 0);
                sur = survey[i].charAt(1)+"";
                result.put(sur, result.getOrDefault(sur, 0) + 0);
            }
        }

        for (int i = 0; i < cases.length; i++) {
            String chartic = cases[i];
            int charticF = result.getOrDefault(String.valueOf(chartic.charAt(0)), 0);
            int charticS = result.getOrDefault(String.valueOf(chartic.charAt(1)), 0);

            if(charticF > charticS) {
                answer+=String.valueOf(chartic.charAt(0));
            }
            if (charticF < charticS) {
                answer+=String.valueOf(chartic.charAt(1));
            }

            if(charticF == charticS) {
                answer+=String.valueOf(chartic.charAt(0));
            }

        }
        return answer;
    }
}

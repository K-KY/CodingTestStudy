package org.example.programmers;

public class Babbling {
    public static void main(String[] args) {
        SolutionBabbling sb = new SolutionBabbling();
        String[] babbling = {"ayayeayayeayaye", "yeyeyeye", "mayemaye", "woomawoowoo"};
        System.out.println("sb.solution(babbling) = " + sb.solution(babbling));
    }
}
class SolutionBabbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya","ye","woo","ma"};
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < arr.length; j++) {

                babbling[i] = babbling[i].replace(arr[j], "0");
                if(!babbling[i].contains("00")){
                    babbling[i] = babbling[i].replace("0", "1");
                }

            }
            if(babbling[i].replace("1", "").length() == 0) {
                answer++;
            }

            System.out.println(babbling[i]);

        }
        return answer;
    }
}


package org.example.programmers;

import java.util.Arrays;
import java.util.HashMap;

public class RunningRace {
    public static void main(String[] args){
        Solution solution =  new Solution();
        String[] players = {"강동원","송강호","정우성","김태희","주지훈","일론 머스크"};
        String[] callings = {"일론 머스크","일론 머스크","김태희","일론 머스크"};
        System.out.println(Arrays.toString(solution.solution(players, callings)));

    }
}

class Solution {
    public String[] solution(String[] players, String[] callings) {
        //rankPlayer
        HashMap<Integer,String> pMap = new HashMap<Integer,String>();
        //playerRank
        HashMap<String,Integer> rMap = new HashMap<String,Integer>();
        //calledPlayer
        HashMap<Integer,String> cMap = new HashMap<Integer,String>();
        for(int i = 0; i<players.length;i++){
            pMap.put(i,players[i]);
        }
        for(int i = 0; i<players.length;i++){
            rMap.put(players[i],i);
        }
        for(int i = 0; i<callings.length;i++){
            cMap.put(i,callings[i]);
        }
        System.out.println("pMap = " + pMap);
        System.out.println("rMap = " + rMap);
        System.out.println("cMap = " + cMap);




        for(int i = 0; i<callings.length;i++){//0

            String called = cMap.get(i);//kai
            int calledRank = rMap.get(called);//3
            String calledPlayer = pMap.get(calledRank);//kai

            String calledFront = pMap.get(calledRank-1);//poe

            pMap.put(calledRank-1,calledPlayer);//kai
            pMap.put(calledRank,calledFront);//poe

            rMap.put(calledPlayer,calledRank-1);
            rMap.put(calledFront,calledRank);

            // System.out.println("pMap:::::"+pMap);

        }
        // System.out.println(rMap);
        // System.out.println(pMap);
        // System.out.println(cMap);


        String[] answer = new String[players.length];
        for(int i = 0; i<pMap.size();i++){
            answer[i] = pMap.get(i);
        }
        return answer;
    }
}
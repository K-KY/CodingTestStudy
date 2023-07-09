package org.example.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class backJun12891 {
    public static void main(String[] args) throws IOException {
        String actg = "ACGT";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int strLength = Integer.parseInt(st.nextToken());
        int pswLength = Integer.parseInt(st.nextToken());

        String[] strArr = br.readLine().split("");

        st = new StringTokenizer(br.readLine());

        HashMap<String, Integer> reqHash = new HashMap<>();
        HashMap<String, Integer> checkHash = new HashMap<>();
        for(int i = 0; i < actg.length(); i++) {
            String key = actg.charAt(i) + "";
            reqHash.put(key, Integer.parseInt(st.nextToken()));
        }
        System.out.println("reqHash = " + reqHash);
        for(int i = 0; i < pswLength; i++) {
            setValue(strArr[i], checkHash);
        }
        int answer = checkCount(reqHash, checkHash);

        for(int i = pswLength; i < strLength; i++) {
            int j = i - pswLength;
            setValue(strArr[i], checkHash);
            removeValue(strArr[j], checkHash);
            answer += checkCount(reqHash, checkHash);

        }
        System.out.println(answer);

    }
    static void setValue(String str, HashMap<String, Integer> checkHash) {
        checkHash.put(str, checkHash.getOrDefault(str, 0) + 1);
    }
    static void removeValue(String str, HashMap<String, Integer> checkHash) {
        checkHash.put(str, checkHash.get(str) - 1);
    }
    static int checkCount(HashMap<String, Integer> reqHash, HashMap<String, Integer> checkHash) {
        boolean check = reqHash.entrySet().stream().map((entry) -> {
            if (checkHash.getOrDefault(entry.getKey(), 0) < entry.getValue()){
                return 0;
            }
            return 1;
        }).noneMatch(num -> num == 0);

        if(check) {
            return 1;
        }
        return 0;
    }
}


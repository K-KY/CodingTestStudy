package org.example.backjun;

import java.util.HashMap;
import java.util.Scanner;

public class StudyVoca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        HashMap<String,Integer> hashMap = new HashMap<>();
        int max = 0;
        String maxC = "";
        for(int i = 0; i < str.length(); i++){
            hashMap.put(String.valueOf(str.charAt(i)),hashMap.getOrDefault(String.valueOf(str.charAt(i)),0)+1);
            if(hashMap.get(String.valueOf(str.charAt(i)))>max){
                max = hashMap.get(String.valueOf(str.charAt(i)));
                maxC = String.valueOf(str.charAt(i));
            }
        }
        int mn = 0;
        for(int i = 0; i<str.length(); i++){
            if(hashMap.get(String.valueOf(str.charAt(i)))==max){
                mn++;
            }
            if(mn>max){
                maxC="?";
            }
        }
        System.out.println(maxC);


    }
}
package org.example.doitBook;

public class TimeComplexity1 {
    public static void main(String[] args){
        int findNum = (int)(Math.random() * 100);
        for(int i = 0; i < 100; i++){
            if(i == findNum){
                System.out.println("i = " + i);
                break;
            }
        }
    }
}
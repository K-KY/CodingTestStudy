package org.example.backjun;

import java.util.Scanner;

public class DeficientChessPieces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] pieces = {1, 1, 2, 2, 2, 8};
        int[] need = new int[pieces.length];
        for(int i = 0; i < pieces.length; i++){
            int n = sc.nextInt();
            if(pieces[i]>n){
                need[i] = pieces[i]-n;
            }
            if(pieces[i] < n){
                need[i] = -(n-pieces[i]);
            }
        }

        for(int i = 0; i < need.length; i++){
            System.out.println("need = " + need[i]);
        }

    }

}
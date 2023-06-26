package org.example.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SortNumber25350InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int whole = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        int[] arr = new int[whole];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < arr.length-1; i++){
            int j = i;
            while(j>=0&&arr[j]>arr[j+1]){
                swap(arr,j,j+1);
                j--;
            }
        }
        Show show = new Show();

        System.out.println(arr[arr.length-cut]);
        show.show(arr);
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
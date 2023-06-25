package org.example.backjun;

import java.util.Scanner;

public class SortNumber2750InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Show show = new Show();
        SortNumber2750InsertionSort sn = new SortNumber2750InsertionSort();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length-1; i++){
            //-1 을 하는 이유 :: while 문 조건을 보면 j+1 을 하고 있음 -1 을 안해주면 배열 범위를 넘어가서 에러남
            int j = i;
            while(j>=0&&arr[j]>arr[j+1]){
                sn.swap(arr, j, j+1);
                j--;
            }
        }
        show.show(arr);

    }
    void swap(int[] arr, int a, int b){
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
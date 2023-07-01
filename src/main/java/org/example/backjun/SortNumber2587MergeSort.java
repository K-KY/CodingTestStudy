package org.example.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNumber2587MergeSort {
    static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println(sum/arr.length);
        System.out.println(arr[2]);
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
            //이거 지금 정렬 안되고있음
        }

    }
    static void mergeSort(int[] arr, int start, int end){
        if(start==end){
            return;
        }
        sorted = new int[arr.length];
        int middle = (start+end) / 2;
        mergeSort(arr,start,middle);
        mergeSort(arr, middle+1,end);
        merge(arr,start,middle,end);
    }
    static void merge(int[] arr, int start, int middle, int end){
        int stt = start;
        int m = middle+1;
        int i = start;
        while(stt<=middle&&m<=end){//
            if(arr[stt] < arr[m]){
                sorted[i] = arr[stt];
                stt++;
            }else{
                sorted[i] = arr[m];
                m++;
            }
            i++;
        }

        while(stt<=middle){
            sorted[i] = arr[stt];
            i++;
            stt++;
        }
        while(m<=end){
            sorted[i] = arr[m];
            i++;
            m++;
        }
        for(i = start; i<=end; i++){
            arr[i] = sorted[i];
        }

    }
}
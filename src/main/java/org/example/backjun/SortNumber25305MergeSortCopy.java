package org.example.backjun;

import java.io.*;
import java.util.Scanner;

public class SortNumber25305MergeSortCopy {

    private static int[] sorted;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] inputArr = new int[N];

        for(int i=0;i<N;i++){
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(inputArr,0,inputArr.length-1);

        StringBuilder sb = new StringBuilder();

        for(int i=0;i< inputArr.length;i++){
            sb.append(inputArr[i]+"\n");
        }

        System.out.println(sb);
    }

    private static void mergeSort(int[] arr){
        sorted = new int[arr.length];
        mergeSort(arr,0,arr.length-1);
        sorted=null;
    }

    private static void mergeSort(int[] arr, int start, int end){
        //start==right가 되면 다 나누어졌으므로 return
        if(start==end) return;
        sorted = new int[arr.length];
        //그렇지 않은 경우(=아직 나누어야 하는 경우) mid값을 기준으로 재귀호출
        int middle = (start+end)/2;
        mergeSort(arr,start,middle);
        mergeSort(arr,middle+1,end);

        //다 나누어지면 병합 method 호출
        merge(arr, start, middle, end);
    }

    private static void merge(int[] arr, int start, int middle, int end){
        int stt = start;//정렬할 배열을 확인하기 위한 값
        int mid = middle +1;//middle 까지 나누고 middle 다음의 값
        int i = start;//정렬된 숫자를 넣기 위한 값

        //arr[stt], arr[middle] 비교하고 더 큰 값을 sorted[i]에 넣음
        while(stt<=middle&&mid<=end){
            if(arr[stt]<=arr[mid]){
                sorted[i] = arr[stt];
                stt++;
            }else{
                sorted[i] = arr[mid];
                mid++;
            }
            i++;
        }

        //좌, 우 한 쪽이 다 채워지면 나머지 값들을 마저 채워넣음
            while(stt<=middle){
                sorted[i] = arr[stt];
                stt++;
                i++;
            }
            while(mid<=end){
                sorted[i] = arr[mid];
                mid++;
                i++;
            }


        //sorted 배열의 값을 기존 배열에 복사해 줌
        for( i=start;i<=end;i++){
            arr[i] = sorted[i];
        }
    }




}

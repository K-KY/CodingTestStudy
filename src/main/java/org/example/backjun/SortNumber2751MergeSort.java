package org.example.backjun;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortNumber2751MergeSort{
    private static int[] sorted;//정렬된 숫자가 들어갈 배열을 static 으로 선언

    static void mergeSort(int[] arr){
        sorted = new int[arr.length];
        mergeSort(arr,0,arr.length-1);
        sorted=null;

    }
    static void mergeSort(int[] arr, int start, int end){
        //start 가 end 랑 같아지면 나눌게 더이상 없음 그대로 리턴
        if(start == end){
            return;
        }
        sorted = new int[arr.length];
        int middle = (start+end)/2;
        //재귀함수로 start 부터 middle 까지의 값을 다시 넣는다
        mergeSort(arr,start,middle);
        //재귀함수로 middle+1 부터 끝까지의 값을 넣는다
        mergeSort(arr,middle+1,end);

        //병합 메소드
        merge(arr,start,middle,end);
    }
    static void merge(int[] arr, int start, int middle, int end){
        int stt = start;//정렬할 배열을 확인하기 위한 값
        int m = middle +1;//middle 까지 나누고 middle 다음의 값
        int i = start;//정렬된 숫자를 넣기 위한 값
        while(stt<=middle&&m<=end){
            if(arr[stt]<=arr[m]){
                sorted[i] = arr[stt];
                stt++;
            }else{
                sorted[i] = arr[m];
                m++;
            }
            i++;
        }
        //좌 우 중 먼저 한쪽이 다 채워지면 나머지 값을 채워넣음
        while(stt<=middle){
            sorted[i] = arr[stt];
            stt++;
            i++;
        }
        while(m<=end){
            sorted[i] = arr[m];
            i++;
            m++;
        }
        for(i = start; i<=end; i++){
            System.out.println("start = " + start);
            System.out.println("end = " + end);
            arr[i] = sorted[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());//숫자 갯수
        int[] arr = new int[num];//숫자가 입력될 배열

        for(int i = 0; i<num; i++){
            //for문으로 숫자를 저장
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr,0,arr.length-1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

    }
}
/*
public class SortNumber25305MergeSort {

    void merge(int[] arr, int start, int middle, int end){
        int[] sorted = new int[arr.length];
        int i = start;//start 부터 middle
        int j = middle +1;//middle +1 부터 end
        int k = start;//sorted 에 값을 넣을때 씀
        //i 의 범위는 middle 까지, j 의 범위는 end 까지
        while(i<=middle&&j<=end){
            if(arr[i] <=arr[j]){//더 작은값을 sorted 에넣는다
                System.out.println("if arr = " + arr[i]);
                System.out.println("i = " + i);
                sorted[k] = arr[i];
                i++;
            }else{
                System.out.println("else arr = " + arr[j]);
                System.out.println("j = " + j);
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= middle){
            sorted[k] = arr[i];
            k++;
            i++;
        }
        while(j <= end){
            sorted[k] = arr[j];
            j++;
            k++;
        }
        //여기서 좀 헤맸음 넣을때 m 은 start 부터 end 까지 작거나 같아야함
        for (int m = start; m <= end; m++){
            System.out.println("m = " + m);
            System.out.println("sorted = " + sorted[m]);
            System.out.println("arr[m] = " + arr[m]);
            arr[m] = sorted[m];
        }

    }
    void mergeSort(int[] arr, int start, int end){
        if(start<end){
            int middle = (start + end) / 2;
            //중간값을 알아내기 위해 2로 나눔
            mergeSort(arr,start,middle);
            //중간값의 중간값을 알아내야함 start 는 그대로 두고 2로 나눠서 나온 중간값인 middle 를 end 값으로 넣음
            mergeSort(arr,middle+1,end);
            //middle 까지 나눴으니 middle 다음부터인 middle + 1 부터 끝까지 다시 중간값을 구한다
            merge(arr, start, middle, end);
            //재귀함수가 호출되고 다시 리턴하면서 각 재귀함수의 값들로 들어갈거임
            //여기서 쪼갠 값들을 다시 이어붙임

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[Integer.parseInt(br.readLine())];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        SortNumber25305MergeSort sn = new SortNumber25305MergeSort();
        sn.mergeSort(arr,0,arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}*/

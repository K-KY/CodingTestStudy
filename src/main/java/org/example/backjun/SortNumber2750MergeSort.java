package org.example.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNumber2750MergeSort {
    static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i< arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
        }

    }

    static void mergeSort(int[]arr, int start, int end){
        if(start == end){
            return;
        }
        sorted = new int[arr.length];
        int middle = (start+end)/2;
        mergeSort(arr, start,middle);
        mergeSort(arr, middle+1, end);
        merge(arr,start,middle,end);
    }
    static void merge(int[] arr, int start, int middle, int end) {

        int stt = start;
        int m = middle + 1;
        int i = start;
        while (stt <= middle && m <= end) {//시작점부터 중간까지 중간 다음부터 끝까지
            //여기서 확인할 부분은 stt 부터 m 까지
            if (arr[stt] <= arr[m]) {
                sorted[i] = arr[stt];
                stt++;
            } else {
                sorted[i] = arr[m];
                m++;
            }
            i++;
        }

        while (stt <= middle) {//stt가 middle 보다 다면 다 채워지지 않은거임
            sorted[i] = arr[stt];
            stt++;
            i++;
        }
        while (m <= end) {//위와 같음
            sorted[i] = arr[m];
            m++;
            i++;
        }
        //정렬된 배열을 원래 배열에 옮긴다
        for (i = start; i <= end; i++) {//start ~ end 가 0부터 arr.length가 아님
            arr[i] = sorted[i];
        }
    }
}
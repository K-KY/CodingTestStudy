package org.example.backjun;

import java.util.Scanner;

public class SortNumber2750QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        int[] arr = new int[leng];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        SortNumber2750QuickSort sn = new SortNumber2750QuickSort();
        sn.quickSort(arr,0,arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
        }

    }
    void quickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int pivot = start;
        int low = start+1;
        int high = end;
        while(low<=high){
            //앞에서 시작 (피벗보다 큰 값 찾기)
            while(low<=end&&arr[low]<=arr[pivot]){
                low++;
                System.out.println("low = "+low+", "+"end = "+end);
            }

            //뒤에서 시작 ( 피벗보다 작은 값 찾기)
            while(high>start&&arr[high]>=arr[pivot]){
                high--;
            }
            if(low>high){//피벗과 hi 를 교체
                swap(arr,pivot,high);
            }else{
                swap(arr,high,low);
            }
        }
        quickSort(arr,start,high-1);// 순서 바뀌어도 상관 없음
        quickSort(arr,high+1,end);
    }
    void swap(int[] arr, int a, int b){
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
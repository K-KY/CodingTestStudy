package org.example.backjun;

import java.util.Scanner;

public class SortNumber2587QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Show show =new Show();
        SortNumber2587QuickSort sn = new SortNumber2587QuickSort();
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sn.quickSort(arr,0,arr.length-1);
        show.show(arr);
        System.out.println("ave = " + sum/arr.length);
        System.out.println("arr[3] = " + arr[3]);

    }
    void quickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int pivot = start;
        int low = start+1;
        int high = end;
        while(low<=high){
            while(low<=end&&arr[pivot]>=arr[low]){//피벗보다 큰 값
                low++;
            }
            while(high>start&&arr[pivot]<=arr[high]){//피벗보다 작은 값
                high--;
            }
            if(low>high){
                swap(arr,high,pivot);
            }else{
                swap(arr,low,high);
            }

        }
        quickSort(arr,start,high-1);
        quickSort(arr,high+1,end);

    }
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
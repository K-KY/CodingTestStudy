package org.example.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortNumber25305QuickSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int every = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        int[] arr = new int[every];
        for(int i = 0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        SortNumber2587QuickSort sn = new SortNumber2587QuickSort();
        sn.quickSort(arr,0,arr.length-1);
        Show show = new Show();
        show.show(arr);
            System.out.println(arr[arr.length - cut]);



    }
    void quickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int pivot = start;
        int low = start+1;
        int high = end;
        while(low<=high){
            while(low<=end&&arr[pivot]>=arr[low]){
                low++;
            }
            while (high>start&&arr[pivot]<=arr[high]){
                high--;
            }

            if(low>high){
                swap(arr,pivot,high);
            }else{
                swap(arr, high,low);
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
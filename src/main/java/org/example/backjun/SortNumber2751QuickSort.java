package org.example.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SortNumber2751QuickSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lines = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
        for(int i = 0; i < lines; i++){
            st = new StringTokenizer(br.readLine());
            arr.put(i,Integer.parseInt(st.nextToken()));
        }
        quickSort(arr,0,arr.size()-1);

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

    }
    static void quickSort(HashMap<Integer, Integer> arr, int start, int end){
        if(start>=end){
            return;
        }
        int pivot = start;
        int low = start+1;
        int high = end;
        while(low<=high){
            while(low<=end&&arr.get(pivot)>=arr.get(low)){
                low++;
            }
            while (high>start&&arr.get(pivot)<=arr.get(high)){
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
    static void swap(HashMap<Integer, Integer> arr, int a, int b){
        int temp = arr.get(a);
        arr.replace(a,arr.get(b));
        arr.replace(b,temp);
    }
}
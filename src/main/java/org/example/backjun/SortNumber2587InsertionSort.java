package org.example.backjun;

import org.example.Main;

import java.util.Scanner;

public class SortNumber2587InsertionSort {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Main sn = new Main();
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Show show = new Show();


        for(int i = 0; i<arr.length-1; i++){
            int j = i;
            while(j>=0&&arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        show.show(arr);
        System.out.println("sum = " + sum/arr.length);
        System.out.println("arr[2] = " + arr[2]);

    }
}
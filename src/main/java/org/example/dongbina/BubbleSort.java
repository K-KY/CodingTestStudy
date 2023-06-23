package org.example.dongbina;

import java.util.Timer;

public class BubbleSort {
    public static void main(String[] args) throws InterruptedException {
        int ms = 0;
        int i = 0, j = 0, temp = 0;
        int[] arr = {10, 1,42,21,26,23,24, 5, 8, 7, 25,27,29,28,39,6, 4,20,18,43, 3, 2, 9,11,12,13,14,15,17,16,19,30};
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length-1-i; j++){
                ms++;
                if(arr[j] > arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("ms = " + ms);
        for(i = 0; i < arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
        }
        ms = 0;
        System.out.println("ms = " + ms);
        int[] arr2 = {10, 1, 5, 8, 7, 6, 4, 3, 2, 9,11,12,13,14,15,17,16,19,20,18,43,42,21,26,23,24,25,27,29,28,39,30};
        for(i = 0; i < arr2.length; i++){
            for(j = i+1; j < arr2.length; j++){
                ms++;

                if(arr2[j] < arr2[i]){

                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println("ms = " + ms);

        for(i = 0; i < arr.length; i++){
            System.out.println("arr2[i] = " + arr2[i]);
        }
    }
}
/*
버블정렬
옆에있는 값과 비교하여 더 작은 값을 앞으로 보내는 방법
효율성이 가장 떨어지는 방법

1 10 5 8 7 6 4 3 2 9

10 + 9 + 8 + ....+ 1
N * (N+1) /2
O(N * N)
버블정렬이 선택 정렬보다 느린이유
버블정렬은 당장 옆의 값과 비교해서 자리를 바꾸는 연산을 수행한다
선택 정렬은 가장 작은 값을 골라서 교체한다
선택 정렬은 각 값의 교체 회수가 1회인 반면 버블 정렬은 가장 큰 수가 앞에 있는경우 데이터의 길이만큼 교체를 수행함

* */
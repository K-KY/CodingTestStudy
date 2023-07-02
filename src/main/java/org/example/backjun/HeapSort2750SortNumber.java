package org.example.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapSort2750SortNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
             arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 1; i < num; i++){
            int child = i;
            do{
                int root = (child -1) / 2;
                if(arr[root] < arr[child]){
                    int temp = arr[root];
                    arr[root] = arr[child];
                    arr[child] = temp;
                }
                child = root;
            }while(child != 0);
        }
        for(int i = 0; i < num; i++){
            System.out.println("arr[i] = " + arr[i]);
        }
        
        for(int i = num -1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            int root = 0;
            int child;
            
            do{
                child = 2 * root +1;
                if(child < i-1 && arr[child]<arr[child+1]){

                    child++;
                    
                }
                //자식노드 중 더 큰 노드 확인
                if(child < i && arr[root] < arr[child]){
                    temp = arr[root];
                    arr[root] = arr[child];
                    arr[child] = temp;
                }
                //root 노드보다 크면 바꿈
                root = child;
            }while (child < i);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
        }


    }
}
/*
* 힙 소트 구현 순서
* BufferedReader
* 배열 저장
* 완전 2진트리 만들기{
*
* }
*
*
*
* */
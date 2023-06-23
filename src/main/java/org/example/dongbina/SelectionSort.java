package org.example.dongbina;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int min = 9999, index = 0, temp = 0;

        for(int i = 0; i < arr.length; i++){
            min = 9999;
            for(int j = i; j < 10; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr = " + arr[i]);
        }
    }
}

/*
 *  1 10 5 8 7 6 4 3 2 9
 * 선택 정렬의 복잡도는 정렬할 배열의 길이 의 제곱
 *  10 * (10 + 1) /2 = 55
 *  N *(N+1) /2
 *  컴퓨터에서는 N 이 크다는 가정 하에 다른 연산들은 의미가 없기 때문에 무시
 *  그래서 N * N 이 됨
 *  O(N * N) O 로 알고리즘을 간략하게 표현 한 거다
 * 만약 데이터 갯수가 10000개라면 1억번정도 계산을 해야한다
 * 처리해야할 데이터 갯수가 많으면 피해야하는 방법
 * */
package org.example.dongbina;

public class QuickSortReview {
    public static void main(String[] args){
        int[] arr = {10, 1,42,21,26,23,24, 5, 8, 7, 25,27,29,28,39,6, 4,20,18,43, 3, 2, 9,11,12,13,14,15,17,16,19,30};
        QuickSortReview qsr = new QuickSortReview();
        qsr.quickSortR(arr,0,arr.length-1);
        for(int i = 0; i<arr.length;i++){
            System.out.println("arr[i] = " + arr[i]);
        }

    }
     void quickSortR(int[] arr, int start, int end){
        if(start>=end) {// start 가 end 보다 크거나 같은경우 원소가 1개이기 때문에 그대로 리턴
            return;
        }

        int pivot = start; //기준점이 될 원소를 선택
        int low = start+1; //낮은 값에서 탐색을 시작
        int high = end; // 높은 값에서부터 탐색을 시작

        while(low<=high){//low 가 high 보다 크거나 같을 때까지, 마지막 까지 가면 low 가 high 보다 커짐
            while(low<=end&&arr[pivot]>=arr[low]){//낮은 값에서부터 탐색을 시작 여기선 피벗보다 큰 원소를 찾는다
                low++;
            }
            while(high>start&&arr[pivot]<=arr[high]){//높은 값에서부터 탐색을 시작 여기선 피벗보다 작은 원소를 찾는다
                high--;
            }
            if(low>high){//만약 low 가 high 보다 커졌을 때, 피벗과 , high 를 교체한다
                swap(arr,high,pivot);
            }else{
                swap(arr,low,high);
            }
        }
        quickSortR(arr,high+1,end);
        quickSortR(arr,start,high-1);


    }
    void swap(int[] arr, int a, int b){
        int temp =0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
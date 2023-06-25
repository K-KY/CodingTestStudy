package org.example.dongbina;


public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 1,42,21,26,23,24, 5, 8, 7, 25,27,29,28,39,6, 4,20,18,43, 3, 2, 9,11,12,13,14,15,17,16,19,30};
        quickSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
        }
    }


    private static void quickSort(int[] arr, int start, int end) {
        // start가 end보다 크거나 같다면 정렬할 원소가 1개 이하이므로 정렬하지 않고 return
        if (start >= end) {
            return;
        }
        // 가장 왼쪽의 값을 pivot으로 지정, 실제 비교 검사는 start+1 부터 시작
        int pivot = start;
        int lo = start + 1;
        int hi = end;

        // lo는 현재 부분배열의 왼쪽, hi는 오른쪽을 의미
        // 서로 엇갈리게 될 경우 while문 종료
        while (lo <= hi) {
            //시작점 에서부터 끝나는 지점 까지
            while (lo <= end && arr[lo] <= arr[pivot]) { // 피벗보다 큰 값을 만날 때까지
                lo++;
                System.out.println("low = "+lo+", "+"end = "+end);

            }
            //끝나는 지점 부터 시작점 까지
            while (hi > start && arr[hi] >= arr[pivot]) { // 피벗보다 작은 값을 만날 때까지
                hi--;
            }
            if (lo > hi){// 엇갈리면 피벗과 교체 : 왼 쪽에선 피벗보다 큰 값을 오른쪽에선 작은 값을 찾는데
                swap(arr, hi, pivot);
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + ", ");

                }
                System.out.println("");
            }
            else{// 엇갈리지 않으면 lo, hi 값 교체
                swap(arr, lo, hi);
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i]+ ", ");
                }
                System.out.println("");
            }
        }

        // 엇갈렸을 경우,
        // 피벗값과 hi값을 교체한 후 해당 피벗을 기준으로 앞 뒤로 배열을 분할하여 정렬 진행
        //여기서부터가 이해가 안됨 -> 여기서만 보면 무한히 호출 되는것 같지만 범위가 점점 줄어들면서 결국 전부다 호출 됨
        System.out.println("첫 번째 재귀함수 호출"+"arr = "+ arr+", "+"start = " + start + ", " + "end = " + (hi-1));
        System.out.println("");
        quickSort(arr, start, hi - 1);
        // 1 2 4 5 3 6 7 "8" 9 10 예를 들어 8이 정렬이 완료 되었다고 했을 때 8을 기준으로 두 집합으로 분할된다
        //여기선 8 을 기준으로 왼쪽 정렬을 수행한다 즉 1부터 7 까지 정렬을 수행
        System.out.println("두 번째 재귀함수 호출"+"arr = "+arr+", "+"start = " + (hi + 1) + ", " + "end = " + end);
        System.out.println("");
        quickSort(arr, hi + 1, end);
        //여기선 8을 기준으로 오른쪽 정렬을 수행한다 즉 9부터 10까지 정렬을 수행
        //hi 는 정렬이 완료된 8의 인덱스

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
// 1 2 4 5 8 3 6 7 9 10 피벗 값보다 작은 값을 찾지 못함 이런 경우 피벗과 하이에서 찾은 가장 작은 값을 변경
// 1 2 4 5 8 3 6 7 9 10 그럼 1의 위치가 확정 다음 피벗 값은 2 위와 동일하게 2의 위치가 확정 다음 피벗값은 4
// 1 2 4 5 8 3 6 7 9 10 0 에서부터 탐색한 피벗보다 큰 값인 5와 끝 에서부터 탐색한 피벗보다 작은 값인 3을 바꿈
// 1 2 4 3 8 5 6 7 9 10 0 에서부터 탐색해 찾은 값은 8 끝에서부터 탐색해 찾은 값은 3 인덱스가 엇갈림
// 1 2 3 4 8 5 6 7 9 10 0 더 작은 값인 3과 피벗값을 바꿔줌 여기서 3의 자리가 확정 피벗값은 4
// 1 2 3 4 8 5 6 7 9 10 앞값은 8 뒷 값은 4가 나옴 이경우 뒷 값에서 찾은 값과 피벗을 교체하는데 피벗과 뒷값이 동일하므로 아무일도 안일어남 다음 피벗값은 8
// 1 2 3 4 8 5 6 7 9 10 8에서부터 찾은 가장 큰 값은 9 , 뒷 값은 7 엇갈리게 됨 피벗과 7을 교체한다 따라서 다음 피벗값은 7
// 1 2 3 4 7 5 6 8 9 10
// 1 2 3 4 6 5 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10
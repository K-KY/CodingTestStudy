package org.example.dongbina;

public class MergeSort {
    int number = 8;
    int size = 0;
    int[] sorted = new int [number];
    int count = 0;
    //배열 , 앞값, 중간값, 맨 끝 값
    void merge(int[] arr, int start, int middle, int end){
        System.out.println("merge() 호출");
        int i = start;//i 부터 middle 까지의 시작값
        int j = middle+1;// middle 이후 분할된 다른 배열의 시작값
        int k = start;
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
        System.out.println("k = "+ k);

        //        int[] array = {7, 6, 5, 8, 3, 2, 9, 1};
        //비교 할 대상이 없을떄까지 반복
        //i 는 중간 값보다 작거나 같고 j 는 끝 값보다 작거나 같음
        while (i <= middle && j <= end){
            if(arr[i] <= arr[j]){
                // arr[i] 가 arr[j] 보자 작으면
                System.out.println("arr[i] =  arr[j] = " + arr[i] + ", " + arr[j]);
                System.out.println("arr[i] <= arr[j] " + sorted[k] + "=" + arr[i]);
                sorted[k] = arr[i];
                //작은걸 넣는다
                i++;
                //다음걸 보기위해 i++
            }else{
                System.out.println("arr[i] =  arr[j] = " + arr[i] + ", " + arr[j]);
                System.out.println("else " + sorted[k] + "=" + arr[j]);
                sorted[k] = arr[j];
                //이외의 경우이니 j 가 작기때문에 k 에는 arr[j] 가 들어간다
                j++;
                //다음걸 보기위해 j++
            }
            k++;
        }

//        if(i > middle){
//            for(int t = j; t <= end; t++){
//                sorted[k] = arr[t];
//                k++;
//            }
//        }else{
//            for(int t = i; t <= middle; t++){
//                sorted[k] = arr[t];
//                k++;
//            }
//        }
        while(i <= middle){
            sorted[k] = arr[i];
            k++;
            i++;
        }
        while(j <= end){
            sorted[k] = arr[j];
            k++;
            j++;
        }
        for (int m = start; m <= end; m++){
            arr[m] = sorted[m];
        }
    }
    void mergeSort(int[] arr, int start, int end){
        //start<end 이어야함
        //start 이 end 보다 커지면 다시 나오면서 두 번째 mergeSort, merge 메소드를 호출함
        //쪼갤수 있는지 여부확인 하는거임
        if(start < end){
            System.out.println("end = " + end);
            System.out.println("start = " + start);
            System.out.println("arr.length = " + arr.length);
            int middle = (start+end) / 2;
            //쪼개기 위한 중간값 찾기
            //여기서 start+end 을 2로 나눔
            System.out.println();
            System.out.println("mergeSort(arr, start, middle)" + " start = " + start + " middle = " + middle );
            mergeSort(arr, start, middle);
            //여기에서 재귀함수 호출되서 다시 start+middle 을 2로 나눔

            System.out.println("mergeSort(arr, middle+1, end)" + " middle + 1 = " + (middle+1) + " end = " + end );
            mergeSort(arr,middle+1, end);
            //여기서 중간 값 다음부터 끝까지
            merge(arr, start, middle, end);
            //쪼갠걸 병합하는 메소드
        }
    }
    public static void main(String[] args){
        int[] array = {7, 6, 5, 8, 3, 2, 9, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array,0, array.length-1);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
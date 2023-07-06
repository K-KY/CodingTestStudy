package org.example.doitBook;

import java.util.Scanner;

public class backJun1940 {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // 기준값, 왼쪽에서 시작할 값, 오른쪽에서 시작할 값을 선언
        int pivot = start;
        int low = start + 1;
        int high = end;
        while (low <= high) {

            while (low <= end && arr[pivot] >= arr[low]) {
                low++;
            }
            while (high > start && arr[pivot] <= arr[high]) {
                high--;
            }
            if (low > high) {//low 값이 high 값보다 커지면 high 와 pivot 을 교체한다
                swap(arr, pivot, high);
            }
            if (low <= high) {
                swap(arr, low, high);
            }
        }
        quickSort(arr, high + 1, end);
        quickSort(arr, start, high - 1);
    }

    public static void main(String[] args) {
        //투포인터를 사용해서 풀어보기
        //개념?
        /*
            줄의 갯수 N 이 주어지고
            재료의 갯수가 N 만큼 무작위 배열로 주어졌다 1, 8, 7, 6, 3, 5, 4, 9, 2
            순서대로 정렬을 한다
            1, 2, 3, 4, 5, 6, 7, 8, 9
            *                       *
            포인터를 양 끝으로 잡는다
            각각 start, end 를 변수명으로 하겠다
            M 이 11이라고 가정을 한다
            start 와 end 를 더해 M 과 비교를 한다 - > start + end < M
            이 때 start + end 가 M 보다 작으므로 start 를 +1 해준다
            1, 2, 3, 4, 5, 6, 7, 8, 9
               *                    *
            다시 비교한다 -> start + end = M
            start + end 와 M 이 같으므로 start+1, end-1 을 한다
            1, 2, 3, 4, 5, 6, 7, 8, 9
                  *              *
            같은 과정을 반복한다.

            결과적으로 (2, 9) (3, 8) (4, 7) (5, 6) 이 M 과 같아 결과는 4 가 된다
         */
        Scanner sc = new Scanner(System.in);
        //모든 재료의 갯수
        int N = sc.nextInt();
        //필요한 재료의 합
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
/*
        Arrays.fill(arr, sc.nextInt());
        //이거는 arr 의 길이만큼 실행하는게 맞긴 한데
        // 안에 있는 메소드는 한번만 실행됨 같은 글자로 여러번 실행하는 거임
*/
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum < M) {
                start++;
            }
            if (sum == M) {
                start++;
                end--;
                count++;
            }
            if (sum > M) {
                end--;
            }

        }
        System.out.println("count = " + count);


//        Scanner sc = new  Scanner(System.in);
//        int material = sc.nextInt();
//        int requestMat = sc.nextInt();
//        int count = 0;
//        int[] arr = new int[material];
//        for (int i = 0; i < material; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] + arr[j] == requestMat) {
//                    count++;
//                }
//            }
//        }
//        System.out.println("count = " + count);
    }
}
/*
*
* 주몽은 철기군을 양성하기 위한 프로젝트에 나섰다.
* 그래서 야철대장을 통해 철기군이 입을 갑옷을 만들게 하였다.
* 야철대장은 주몽의 명에 따르기 위하여 연구에 착수하던 중 아래와 같은 사실을 발견하게 되었다.

갑옷을 만드는 재료들은 각각 고유한 번호를 가지고 있다.
* 갑옷은 두 개의 재료로 만드는데 두 재료의 고유한 번호를 합쳐서 M(1 ≤ M ≤ 10,000,000)이 되면 갑옷이 만들어 지게 된다.
* 야철대장은 자신이 만들고 있는 재료를 가지고 갑옷을 몇 개나 만들 수 있는지 궁금해졌다.
* 이러한 궁금증을 풀어 주기 위하여 N(1 ≤ N ≤ 15,000) 개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.

*
* 첫째 줄에는 재료의 개수 N(1 ≤ N ≤ 15,000)이 주어진다.
* 그리고 두 번째 줄에는 갑옷을 만드는데 필요한 수 M(1 ≤ M ≤ 10,000,000) 주어진다.
* 그리고 마지막으로 셋째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다.
* 고유한 번호는 100,000보다 작거나 같은 자연수이다.



* */
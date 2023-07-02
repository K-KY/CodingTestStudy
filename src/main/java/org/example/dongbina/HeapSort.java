package org.example.dongbina;

public class HeapSort {
    public static void main(String[] args) {
        int[] heap = {7, 6, 5, 8, 3, 6, 9, 1, 6};//정렬할 배열 선언
        int[] arr = {10, 1,42,21,26,23,24, 5, 8, 7, 25,27,29,28,39,6, 4,20,18,43, 3, 2, 9,11,12,13,14,15,17,16,19,30};

        /*
         * 현재 배열의 트리 구조는
         *         7
         *     6       5
         *   8   3   6   9
         * 1   6
         *
         *
         * 아마 정렬된 트리 구조는
         *         9
         *     8       7
         *   6   3   5   6
         * 1   6
         * */
        int number = heap.length;
        for(int i = 1; i < number; i++){//0번째는 최상위 노드임
            int child = i;//
            do{
                System.out.println("perfect binary child = " + child);
                int root = (child-1) / 2;//2진 트리 구조이기 때문에 나누기 2를 하면 부모노드의 인덱스가 나온다
                if(heap[root] < heap[child]){//heap[root] 가 자식 노드보다 커야 하므로 heap[root] 가 더 작다면 둘을 스왑한다
                    int temp = heap[root];
                    heap[root] = heap[child];
                    heap[child] = temp;
                }
                child= root;//스왑 하고 나서도 최상위 노드가 아니라면 상위 노드보다 큰지 확인해야함
                System.out.println("perfect binary root = " + root);
            }while(child != 0);
        }
//정렬이 잘 되었다면 0번째 있는 값은 배열중 가장 큰 값이다
        for(int i = number - 1; i >= 0; i--){
            System.out.println("i = " + i);
            //그러면 0번째 인덱스의 값을 맨 뒤로 보내주면 그건 정렬이 된 상태가 된다
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            int root = 0;
            int child= 1;
            //만약 child 가 커서 while 문에 못 들어가면 여기서 1로 만듦

            //완전 2진트리로 다시 만듬
            do{
                child = 2 * root + 1;
                //자식중에 더 큰값을 찾을라고 하는거임
                System.out.println("root = " + root);
                System.out.println("out if child = " + child);
                if(child < i-1  && heap[child] < heap[child+1]){
                    System.out.println("first if i In = "+ i);
                    System.out.println("first if child = "+ child);
                    //heap[child] < heap[child+1] root 의 자식중 큰 child 를 찾기 위함
                    /*예를 들어 아래와 같이 트리가 있을 때 8 즉 root 가 1인 자식 6, 3 중 큰 값을 찾기 위한 if 문임
                     *         9
                     *     8       7
                     *   6   3   5   6
                     * 1   6
                    * */
                    //i-1 보다  커지면 인덱스를 넘어가거나 정렬이 완료된 인덱스가 나옴
                    //i-1 을 하는 이유 -> heap 에서 비교 할 때 child +1 과 비교하기 때문
                    //이걸 후위에 배치하면 heap[child] 가 먼저 수행되면서 에러남 그러니 어레이에서 범위가 정해져 있는경우 먼저 수행되게 해야함
                    child++;
                    //만약 child +1 더 크면 ++ 로 더 큰값의 인덱스로 만든다
                }
                if(child < i && heap[root] < heap[child]){
                    //정렬되지 않은 범위 내에서 root 와 child 를 비교함
                    //root 보다 child 가 더 크면 스왑
                    System.out.println("second if i In"+ i);

                    temp = heap[root];
                    heap[root] = heap[child];
                    heap[child] = temp;
                }
                root = child;
                //아래로 내려가면서 확인
            }while(child < i);
        }
        for(int i = 0; i < number; i++){
            System.out.println("heap = " + heap[i]);
        }
    }
}
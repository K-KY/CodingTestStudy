package org.example.backjun;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SectionPlus {
    //이 코드는 너무 오래걸림 2.5초 메모리도 많이 잡아먹는듯
    //제한시간 1초던데 이거 어떻게 통과함?
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int line = sc.nextInt();
//        int req = sc.nextInt();
//        HashMap<Integer,Integer> hash = new HashMap<Integer, Integer>();
//        hash.put(0,0);
//        hash.put(1,sc.nextInt());
//        for(int i = 2; i <= line; i++){
//            hash.put(i,sc.nextInt()+hash.get(i-1));
//        }
//        for(int i = 0; i<req; i++){
//            System.out.println( -(hash.get(sc.nextInt()-1)-hash.get(sc.nextInt())) );
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //이게 스캐너보다 빠름
        StringTokenizer st = new StringTokenizer(br.readLine());
        //이건 처음 알았음 String 값을 받으면 String 값을 기본 delimiter 인 공백으로 문자열을 쪼갬 아니 스플릿이랑 똑같은거 아님?
        //그냥 공백은 아니고 텝 엔터 등등 그냥 값 과 값 사이에 있는 공백들을 모조리 없애고 쪼개버림
        //두번째 파라미터로 다른 값을 넣으면 그 값을 기준으로 쪼갬 'ab' 로 들어가면 a도 없애고 b 도 없앰 이 점에서 split 이랑 다름
        //문제에서 첫 줄에 값의 길이와 계산할 횟수를 입력 여기에 두개가 쪼개져서 5,3 으로 들어가있음
        System.out.println("st = " + st.countTokens());
        //토큰의 갯수를 반환
        int suNo = Integer.parseInt(st.nextToken());
        //nextToken 은 다음 토큰 값을 반환한다 타입은 String, nextElement 는 Object 타입을 반환
        System.out.println("suNo = " + suNo);
        int quizNo = Integer.parseInt(st.nextToken());
        System.out.println("quizNo = " + quizNo);

        long[] s = new long[suNo + 1];
        //long 타입으로 주어질 숫자들이 들어갈 배열을 생성
        st = new StringTokenizer(br.readLine());
        //여기서 숫자 값들이 입력됨
        for(int i = 1; i<=suNo; i++){
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
            //for 문 돌려서 구간합을 구함 그리고 배열에 넣음
        }
        for(int i = 0; i<quizNo; i++){
            st = new StringTokenizer(br.readLine());
            //여기서 합 할 구간을 받음
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(s[b]-s[a-1]);
        }
    }
}

/**구간합
 * 1 2 3 4 5 의 배열이 있을 때
 * 1, 1~2, 2~3, 3~4, 4~5 의 값을 구해놓는것
 * 각 값은 1 에서부터 n 까지의 합을 구한것과 같음
 * ex)
 * [1] 1 = 1
 * [2] 1~2 = [1]:1+2 = 3    주어진 배열의 1번째부터 2번째 까지의 합
 * [3] 2~3 = [2]:3+3 = 6    주어진 배열의 1번째부터 3번째 까지의 합
 * [4] 3~4 = [3]:6+4 = 10   주어진 배열의 1번째부터 4번째 까지의 합
 * [5] 4~5 = [4]:10+5 = 15  주어진 배열의 1번째부터 5번째 까지의 합
 * 만약 2번째 값부터 5번째 값까지의 합을 구해야 한다면
 * [5]-[2-1] 을 하면 원하는 값인 14가 나온다
 * a ~ b 의 값을 구하고자 한다면 [b] 의 값에서  [a-1] 의 값을 뺀다
 * 증명)
 * 1 2 3 4 5
 * 2번째 값인 2부터 5번째 값인 5까지 더한 값은 = 14
 * [5] - [1] = 15 -1 = 14
 * 3번째 값 부터 5번째 값까지 의 합
 * [5] - [2] = 15 - 3 = 12
 *
 */
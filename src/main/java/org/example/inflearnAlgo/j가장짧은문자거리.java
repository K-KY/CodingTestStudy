package org.example.inflearnAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


*/
public class j가장짧은문자거리 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String find = st.nextToken();
        String result = "";
        int index = 0;

        //문자열의 첫 글자부터 차례로 확인한다
        for (int i = 0; i < str.length(); i++) {
            //i 번째 글자가 찾고자 하는 글자와 같다면 index를 0으로 하고 result 에 index를 더한다
           if (String.valueOf(str.charAt(i)).equals(find)) {
               index = 0;
               result += index + " ";
           }

           //i 번 째 글자가 찾고자 하는 글자와 다른 경우
           if (!String.valueOf(str.charAt(i)).equals(find)) {
               index++;
               //index +1

               //만약 kkkkmmmmm m 인 경우
               //m 의 인덱스는 4 i = 0 인 경우 4 - 0 = 4
               //이게 없으면 result 에는 index++(1) 이 들어감
               //원래 들어가야 하는건 4 - 0 = 4
               //다음값도 0 보다 크기 때문에 4 - 1 = 3
               if (str.indexOf(find) - i > 0) {
                   result += str.indexOf(find) - i + " ";
                   //여기서 indexOf() 는 첫번째 find 의 인덱스를 반환
                   continue;
               }
               //첫번째 m 의 index 보다 i 가 커지면 수행
               result += index + " ";
           }
        }
        System.out.println("result = " + result);
        String[] strL = result.split(" ");
        //왼쪽에서부터 거리를 잰 값을 저장한다
        result = "";
        //result 초기화
        for (int i = 0; i < str.length(); i++) {
            //오른쪽 에서부터 거리를 잰다
            if (String.valueOf(str.charAt(str.length() - (i + 1))).equals(find)) {
                // 만약 str.length() 5 -> index = 0 1 2 3 4, -> 5 - (0 + 1)
                index = 0;
                result += index + " ";
            }
            //index 를 초기화 하지 않았기 때문에 다음 find 를 찾기 전까지 leftIndex 에 ++ 된 값이 들어감
            //leftIndex 와 rightIndex 를 비교하면서 가장 작은값을 넣을거라서 상관 없음
            if (!String.valueOf(str.charAt(str.length() - (i + 1))).equals(find)) {
                index++;
                result += index + " ";
            }
        }
        String[] strR = result.split(" ");
        System.out.println("result = " + result);
        result = "";

        for (int i = 0; i < str.length(); i++) {
            //leftIndex 와 rightIndex 를 비교해서 작은 값을 result 에 더한다
            //rightIndex 는 거꾸로 들어가 있으므로 leftIndex 는 0부터 rightIndex 는 마지막 값부터 비교한다
            result += Math.min(Integer.parseInt(String.valueOf(strL[i])), Integer.parseInt(String.valueOf(strR[strR.length - (i + 1)]))) + " ";
        }
        System.out.println(result);
    }
/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String find = st.nextToken();
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            int dis = 9999;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals(find)) {
                    if (dis > Math.abs(j - i)) {
                        dis = Math.abs(j - i);
                    }

                }
            }
            result += dis + " ";
        }

        System.out.println("result = " + result);
    }
*/

}

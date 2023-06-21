package org.example.backjun;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //스캐너 선언 사용자로부터 입력을 받는다
        int sum = 0;
        // 합을 담을 값 지정
        int leng = Integer.parseInt(sc.nextLine());
        //값의 길이 nextLine nextLine 은 String 타입이기 때문에 Integer 로 파싱
        String num = sc.nextLine();
        //
        for(int i = 0; i < leng; i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));

        }
        System.out.println(sum);
    }
}

/*Scanner sc = new Scanner(System.in);
int n = sc.nectInt();
String sNum = sc.next();
char[] cNum = sNum.thCharArray();
int sum = 0;
for( int i = 0; i< cNum.length; i++){
	sum += cNum[i] - '0';

	}

	System.out.println(sum);*/

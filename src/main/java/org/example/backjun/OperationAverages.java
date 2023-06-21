package org.example.backjun;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OperationAverages {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
//여기까진 나랑 비슷함

        long sum = 0;
        long max = 0;

//20 30 40
        for(int i = 0; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
            sum = sum +a[i];
        }
        System.out.println("sum*100.0/max/n = " + sum*100.0/max/n);
        //90*100/40/3
/*
        Scanner sc = new Scanner(System.in);
        int subjects = Integer.parseInt(sc.nextLine());
        //과목 개수 입력받음
        double sum = 0;
        String[] score = sc.nextLine().split(" ");// 50 60 70
        //어짜피 한줄로 줄테니까 그냥 한번에 스플릿까지
        int maxScore= 0;
        //최대점수
        for(int i = 0; i < score.length; i++){
            int sco = Integer.parseInt(score[i]);
            if(maxScore < sco){
                maxScore = sco;
            }
        }

        for(int i = 0; i < score.length; i++){
            sum +=  (double)Integer.parseInt(score[i])/maxScore*100;
            System.out.println("sum = " + sum);
            System.out.println("Integer.parseInt(score[i])/maxScore = " + Integer.parseInt(score[i])/maxScore);
            System.out.println("Integer.parseInt(score[i])/maxScore*80 = " + Integer.parseInt(score[i])/maxScore*80);
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("sum = " + sum);
        System.out.println("average = " + sum/subjects);
*/
    }
}

//현점수/최대점수*100
//String 에서 최댓값을 구하는 방법은 없을까
//->스플릿 후 for 문 돌려서 int 로 파싱? 이거밖에 생각 안남
//for 문 적게 쓰고싶은데 한번안에 끝낼수 있는 방법? 안그럼 int 배열 하나 더 만들어야하는데
//하나 생각났는데 너무 지저분함 -> 일단 나오는대로 구하는데 현재 최대 점수보다 큰 점수가 나오면 다시 i = 0 으로 만들기: for 문 여러개 쓰는게 나을듯
// 이걸로 가자 더 어려워진거같은데? 버리자 이건 ,,아 될것같은데
//메소드를 만들어서 for 문을 밖으로 빼놓으면? 좀 더 비효율적인데? 깔끔해지나?
// 신기하네 왜 (double) 로 캐스팅 안하면 100만 들어가지 ==== 40/80 하면 0.5 인데 int 형이라 그냥 소수점 뒷자리 잘린듯

//스캐너를 잘 모르고 있었네
//nextInt 로 하면 10 20 30 해도 알아서 각각 값으로 들어감

//수학을 포기한게 여기서 발목을 잡네
//조금만 생각해보면 A*B+B*B+C*B 니까 (A+B+C)B 로 정리되네
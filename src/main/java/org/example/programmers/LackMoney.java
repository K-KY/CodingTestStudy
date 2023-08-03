package org.example.programmers;

public class LackMoney {
    public static void main(String[] args) {
        long price = 1000;
        long money = 10000000;
        int count = 1233;
        LackMoneySolution s = new LackMoneySolution();
        System.out.println(s.solution(price, money, count));
    }

}

class LackMoneySolution {
    public long solution(long price, long money, int count) {
        long answer = -1;
        for (int i = 1; i <= count; i++) {
            money = money - price * i;
        }
        if (money < 0) {
            answer = Math.abs(money);
        }
        if (money >= 0) {
            answer = 0;
        }
        return answer;
    }
}


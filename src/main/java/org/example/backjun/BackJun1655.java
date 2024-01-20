package org.example.backjun;

import java.util.*;

public class BackJun1655 {
    static List<Integer> scope = new ArrayList<>();
    public static void main(String[] args) {
        List<Integer> queue = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int repeat = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < repeat; i++) {
            queue.add(Integer.parseInt(sc.nextLine()));
        }
        Collections.sort(queue);
        for (int i = 0; i < queue.size(); i++) {
            findMiddle(queue, i);

        }
    }

    public static void findMiddle(List<Integer> queue, int n) {
        for (int i = 0; i < n; i++) {
            scope.add(queue.get(i));
        }
        if (scope.size() % 2 == 0 && scope.size() > 1) {
            System.out.println(scope.get(scope.size() / 2 - 1));
            return;
        }
        System.out.println(scope);
        System.out.println(scope.get(scope.size() / 2));
    }
}

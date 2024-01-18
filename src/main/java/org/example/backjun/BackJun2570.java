package org.example.backjun;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class BackJun2570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        int sq = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sq; i++) {
            List<String> nums = Arrays.asList(sc.nextLine().split(" "));
            nums.forEach(n -> set.add(Integer.parseInt(n)));
        }
        System.out.println(set.toArray()[set.size() - sq]);
    }
}

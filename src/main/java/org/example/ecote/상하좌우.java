package org.example.ecote;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 상하좌우 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int square = Integer.parseInt(sc.nextLine());
        int x = 1;
        int y = 1;
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        while (st.hasMoreTokens()) {
            String move = st.nextToken();
            System.out.println("move = " + move);
            if (move.equals("U") && x > 1) {
                x--;
            }
            if (move.equals("D") && x <= square) {
                x++;
            }
            if (move.equals("L") && y > 1) {
                y--;
            }
            if (move.equals("R") && y <= square) {
                y++;
            }
        }
        System.out.println("(hor + ,  + ver) = " + (x + ", " + y));
    }
}

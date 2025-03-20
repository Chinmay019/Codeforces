package src;

import java.util.Scanner;

public class Tram116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int current = 0, max = 0;
        while(t-- > 0) {
            int exit = sc.nextInt();
            int entry = sc.nextInt();
            current += entry - exit;
            max = Math.max(max, current);
        }
        System.out.println(max);
    }
}

package src;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        String stones = sc.next();

        for(int i = 0; i < n; i++ ) {
            char currentChar = stones.charAt(i);
            if(i == 0) {
                continue;
            }
            char prevChar = stones.charAt(i - 1);
            if(currentChar == prevChar) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}

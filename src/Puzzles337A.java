package src;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++ ) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i <= (m - n); i++) {
            int diff = arr[n + i - 1] - arr[i];
            ans = Math.min(ans, diff);
        }
        System.out.println(ans);
    }
}

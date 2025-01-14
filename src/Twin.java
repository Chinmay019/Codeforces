package src;

import java.util.Arrays;
import java.util.Scanner;

public class Twin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] coins = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            total += coins[i];
        }
        Arrays.sort(coins);
        int sum = 0;
        for(int i = n - 1; i >= 0; i--) {
            sum += coins[i];
            if(sum > total - sum) {
                System.out.println(n - i);
                break;
            }
        }
    }
}

package src;

import java.util.Scanner;

public class Games268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] home = new int[n];
        int[] away = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            away[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && home[i] == away[j])
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
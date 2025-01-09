package src;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int[] scores = new int[n];
        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int limit = scores[k - 1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >0 && scores[i] >= limit) {
                count += 1;
            }
            if (scores[i] < limit)
                break;
        }
        System.out.println(count);
    }
}

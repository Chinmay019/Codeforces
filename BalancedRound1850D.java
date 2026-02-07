import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound1850D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int[] diff = new int[n - 1];
            for (int i = 1; i < n; i++) {
                diff[i - 1] = arr[i] - arr[i - 1];
            }
            int max = 0;
            int count = 0;
            for (int j : diff) {
                if (j <= k) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
            int ans = Math.max(n - max - 1, 0);
            System.out.println(ans);
        }
    }
}

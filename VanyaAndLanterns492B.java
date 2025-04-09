import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns492B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt();
        int[] arr = new int[n + 1];
        int nonZeroMin = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
            if(arr[i] != 0 && arr[i] < nonZeroMin) {
                nonZeroMin = arr[i];
            }
        }
        if(n == 1) {
            int ans = Math.max(l- arr[0], arr[0]);
            System.out.println(ans);
        }
        else {
            arr[n] = nonZeroMin * -1;
            double maxDiff = 0;
            Arrays.sort(arr);
            for(int i = 0; i < n; i++) {
                double diff = (double) (arr[i + 1] - arr[i]) / 2;
                maxDiff = Math.max(maxDiff, diff);
            }
            maxDiff = Math.max(maxDiff, l - arr[n]);
            System.out.println(maxDiff);
        }
    }
}

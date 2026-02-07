import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TenWordsOfWisdom1850B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n + 1][3];
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                int[] temp = {a, b, i};
                arr[i] = temp;
            }
            Arrays.sort(arr, Comparator.comparingInt((int[] x) -> x[1]).reversed());
            for (int i = 0; i < n; i++) {
                int[] val = arr[i];
                if(val[0] <= 10) {
                    System.out.println(val[2]);
                    break;
                }
            }
        }
    }
}

import java.util.Scanner;

public class NoCasinointheMountains2126B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int ans = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1) {
                    ans += Math.floorDiv(count + 1, k + 1);
                    count = 0;
                } else {
                    count++;
                }
            }
            ans += Math.floorDiv(count + 1, k + 1);
            System.out.println(ans);
        }
    }
}

import java.util.Scanner;

public class HolidayOfEquality758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;
        for(int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int ans = 0;
        for(int i : arr) {
            if(i < max) {
                ans += max - i;
            }
        }
        System.out.println(ans);
    }
}

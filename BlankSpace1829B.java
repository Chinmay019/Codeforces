import java.util.Scanner;

public class BlankSpace1829B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            int val = 0, max = 0;
            for(int i = 0; i < len; i++) {
                if(arr[i] == 0) {
                    val++;
                } else {
                    val = 0;
                }
                max = Math.max(max, val);
            }
            System.out.println(max);
        }
    }
}

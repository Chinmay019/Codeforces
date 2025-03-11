package src;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest1399A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++ ) {
                arr[i] = sc.nextInt();
            }
            if(n == 1)
                System.out.println("YES");
            else {
                boolean reduce = true;
                Arrays.sort(arr);
                for (int i = 0; i < n - 1; i++ ) {
                    if(Math.abs(arr[i] - arr[i + 1]) > 1){
                        reduce = false;
                        break;
                    }
                }
                if(reduce)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}

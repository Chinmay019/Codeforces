package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayRecoloring2075B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long ans = 0;
            Integer[] arr = new Integer[n];
            for(int i = 0; i < n; i++ ) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            for(int i = 0; i < k; i++ ) {
                ans += arr[i];
            }
            ans += arr[k];
            System.out.println(ans);
        }
    }
}

/*
1
6 2
5 1 3 4 8 7
 */
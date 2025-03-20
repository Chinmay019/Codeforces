package src;

import java.util.Scanner;

public class ArrivalOfGeneral144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }
        int minIndex = -1, maxIndex = -1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++ ) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int ans = maxIndex + (n - minIndex - 1);
        if(minIndex < maxIndex)
            ans--;
        System.out.println(ans);
    }
}

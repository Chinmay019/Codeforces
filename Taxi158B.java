package src;

import java.util.Scanner;

public class Taxi158B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[5];
        for(int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
            freq[arr[i]]++;
        }
        int ans = 0;
        for(int i = 1; i < 5; i++ ) {
            if(i == 4) {
                ans += freq[4];
                break;
            }
            else {
                int space = 4 - i;

            }

        }
//        for(int t : arr) {
//            if(t == 4) {
//                ans++;
//                freq[4]--;
//            }
//            else {
//                if(freq[t] <= 0)
//                    continue;
//                freq[t]--;
//                int space = 4 - t;
//                if(freq[space] > 0) {
//                    freq[space]--;
//                }
//                ans++;
//            }
//        }
        System.out.println(ans);
    }
}

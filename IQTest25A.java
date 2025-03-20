package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IQTest25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }

        // calculate each pair diffs , if you fins discrepancy, store those indexes. Middle one will be the odd man out

        for(int i = 0; i < n - 1; i++ ) {
            int diff = arr[i + 1] - arr[i];
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }

    }
}

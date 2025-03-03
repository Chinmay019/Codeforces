package src;

import java.util.*;

public class Dragons230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < n; i++ ) {
            int xi = sc.nextInt();
            int yi = sc.nextInt();
            int val = map.getOrDefault(xi, 0);
            map.put(xi, yi + val);
        }

        for(var item : map.entrySet()) {
            if(s > item.getKey()) {
                s += item.getValue();
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

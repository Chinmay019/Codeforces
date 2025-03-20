package src;

import java.util.Scanner;

public class Pangram520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if(n < 26) {
            System.out.println("NO");
            return;
        }
        int[] freq = new int[26];
        for(char t : s.toLowerCase().toCharArray()) {
            int index = t - 'a';
            freq[index]++;
        }
        boolean pan = true;
        for(int i : freq) {
            if(i == 0)
            {
                pan = false;
                break;
            }
        }
        if(pan)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

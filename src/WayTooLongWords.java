package src;// 71A. Way too long words

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), len;

        String[] words = new String[n];

        sc.nextLine();

        for(int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        for(String word : words) {
            len = word.length();
            if(len > 10) {
                System.out.println(word.charAt(0) + "" + (len - 2) + word.charAt(len - 1));
            }
            else {
                System.out.println(word);
            }
        }
    }
}

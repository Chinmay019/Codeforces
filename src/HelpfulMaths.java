package src;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op  = sc.next();
        int[] freq = new int[4];
        freq[0] = 0;
        for(char ch : op.toCharArray()) {
            if(ch != '+') {
                int digit = ch - '0';
                freq[digit] += 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 3; i++ ){
            for(int j = 0; j < freq[i]; j++ ) {
                sb.append(i);
                sb.append('+');
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}

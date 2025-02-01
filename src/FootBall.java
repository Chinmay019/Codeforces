package src;

import java.util.Scanner;

public class FootBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int consZeroCount = 0, consOneCount = 0;
        boolean d = false;

        for(char ch : s.toCharArray()) {
            if(ch == '0') {
                consZeroCount++;
                consOneCount = 0;
            } else {
                consOneCount++;
                consZeroCount = 0;
            }
            if(consZeroCount >= 7 || consOneCount >= 7) {
                d = true;
                break;
            }
        }
        if(d) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

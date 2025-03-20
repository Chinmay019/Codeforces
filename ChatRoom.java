package src;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String target = "hello";
        int k = 0, count = 0;
        for(int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            if(count < 5 && ch == target.charAt(k)) {
                k++;
                count++;
            }
        }
        if(count == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

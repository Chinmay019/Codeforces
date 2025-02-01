package src;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(stk.isEmpty() && ch == 'h') {
                stk.push('h');
            } else {
                if(!stk.isEmpty()) {
                    if (stk.size() == 1 && stk.peek() == 'h' && ch == 'e') {
                        stk.push('e');
                        continue;
                    }
                    if (stk.size() == 2 && stk.peek() == 'e' && ch == 'l') {
                        stk.push('l');
                        continue;
                    }
                    if (stk.size() == 3 && stk.peek() == 'l' && ch == 'l') {
                        stk.push('l');
                        continue;
                    }
                    if (stk.size() == 4 && stk.peek() == 'l' && ch == 'o') {
                        stk.push('o');
                    }
                }
            }
        }

        String stkStr = stk.stream().map(a -> a.toString()).collect(Collectors.joining(""));
        if(stkStr.equals("hello")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

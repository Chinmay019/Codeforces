package src;

import java.util.Scanner;
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num1.length(); i++ ) {
            if(num1.charAt(i) == num2.charAt(i))
                sb.append('0');
            else
                sb.append('1');
        }
        System.out.println(sb);
    }
}

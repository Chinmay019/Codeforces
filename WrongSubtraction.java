package src;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

        while(k-- > 0) {
            if(num % 10 != 0) {
                num--;
            } else {
                num /= 10;
            }
        }
        System.out.println(num);
    }
}

package src;

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        while(true) {
            y++;
            if(isDistinctDigits(y)) {
                System.out.println(y);
                break;
            }
        }
    }

    public static boolean isDistinctDigits(int year) {
        int[] digits = new int[10];
        while (year > 0) {
            int dig = year % 10;
            digits[dig] += 1;
            year /= 10;
        }
        for(int i = 0; i < 10; i++ ) {
            if(digits[i] >= 2)
                return false;
        }
        return true;
    }
}

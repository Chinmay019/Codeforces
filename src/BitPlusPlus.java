package src;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        int plus = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++ ) {
            String operation = sc.nextLine();
            if(operation.contains("++")) {
                plus += 1;
            } else {
                plus -= 1;
            }
        }

        System.out.println(plus);
    }
}

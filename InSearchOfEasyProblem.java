package src;

import java.util.Scanner;

public class InSearchOfEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isHard = false;
        while(n-- > 0) {
            if(scanner.hasNextInt() && scanner.nextInt() == 1)
                isHard = true;
        }
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("Easy");
        }
    }
}

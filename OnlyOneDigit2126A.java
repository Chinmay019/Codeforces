import java.util.Scanner;

public class OnlyOneDigit2126A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[] arr = String.valueOf(n).toCharArray();
            int min = arr[0] - '0';
            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min , arr[i] - '0');
            }
            System.out.println(min);
        }
    }
}

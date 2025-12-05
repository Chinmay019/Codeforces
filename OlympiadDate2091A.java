import java.util.Scanner;

public class OlympiadDate2091A {
    public static boolean checkAllZero(int[] arr) {
        for (int i : arr) {
            if (i > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = {3, 1, 2, 1, 0, 1, 0, 0, 0, 0};
            int n = sc.nextInt();
            int[] inp = new int[n];
            for (int i = 0; i < n; i++) {
                inp[i] = sc.nextInt();
            }
            int val = 0;
            for (int i = 0; i < n; i++) {
                arr[inp[i]]--;
                if (checkAllZero(arr)) {
                    val = i + 1;
                    break;
                }
            }
            System.out.println(val);
        }
    }
}

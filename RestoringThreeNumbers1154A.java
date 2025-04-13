import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt(), o = sc.nextInt();
        int[] arr = {l, m , n , o};
        Arrays.sort(arr);
        int T = arr[3];
        int x = arr[0];
        int y = arr[1];
        int c = T - x;
        int b = y - c;
        int a = x - b;
        System.out.println(a + " " + b + " " + c);
    }
}

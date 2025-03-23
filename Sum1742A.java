import java.util.Arrays;
import java.util.Scanner;

public class Sum1742A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int[] arr = {a, b, c};
            Arrays.sort(arr);
            if(arr[0] + arr[1] == arr[2]){
                System.out.println("yes");
            } else {
                System.out.println("NO");
            }
        }
    }
}

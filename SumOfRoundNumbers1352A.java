import java.util.Scanner;

public class SumOfRoundNumbers1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[5];
            int i = 0, count = 0;
            while(n > 0) {
                arr[i] = n % 10;
                if(arr[i] != 0)
                    count++;
                i++;
                n /= 10;
            }
            System.out.println(count);
            for(int j = 0; j < 5; j++) {
                int num = (int) Math.pow(10, j) * arr[j];
                if(num != 0)
                    System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}

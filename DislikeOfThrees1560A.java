import java.util.Scanner;

public class DislikeOfThrees1560A {
    public static void main(String[] args) {
        int[] arr = new int[1001];
        int ind = 1;
        for(int i = 1; i <= 1666; i++ ) {
            if(i % 3 != 0 ) {
                if(i % 10 != 3) {
                    arr[ind] = i;
                    ind++;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            System.out.println(arr[sc.nextInt()]);
        }
    }
}
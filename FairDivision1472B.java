import java.util.Scanner;

public class FairDivision1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int total = 0, ones = 0;
            for(int i = 0; i < n; i++ ) {
                int s = sc.nextInt();
                total += s;
                if(s == 1)
                    ones++;
            }
            if(total % 2 == 1) {
                System.out.println("NO");
            } else {
                total /= 2;
                if(total % 2 == 0)
                    System.out.println("YES");
                else {
                    if(ones > 0)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}

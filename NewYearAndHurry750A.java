import java.util.Scanner;

public class NewYearAndHurry750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time  = sc.nextInt();
        int timeLeft = 240 - time;
        int ans = 0;
        for(int i = 1; i <= n; i++ ) {
            if(5 * i <= timeLeft) {
                timeLeft -= 5 * i;
                ans++;
            }
        }
        System.out.println(ans);
    }
}

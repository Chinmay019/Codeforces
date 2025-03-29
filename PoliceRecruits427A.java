import java.util.Scanner;

public class PoliceRecruits427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int runningSum = 0;
        int ans = 0;
        for(int i = 0; i < n; i++ ) {
            int a = sc.nextInt();
            if(runningSum < 0 && a > 0)
                runningSum = 0;
            runningSum += a;
            if(runningSum < 0)
                ans++;
        }
        System.out.println(ans);
    }
}

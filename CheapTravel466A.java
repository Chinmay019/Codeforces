import java.util.Scanner;

public class CheapTravel466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int oneWayTotal = a * n;
        int rides = n / m;
        int rem = n - m * rides;
        int rideTotal = rides * b;
        if(rem > 0) {
            rideTotal = rideTotal + Math.min(rem * a, b);
        }
        int total = Math.min(oneWayTotal, rideTotal);
        System.out.println(total);
    }
}

import java.util.Scanner;

public class DesignTutorialLearnFromMath1791C {
    public boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n - 1; i >= 1; i--) {
        boolean p1 = new DesignTutorialLearnFromMath1791C().isPrime(i);
        boolean p2 = new DesignTutorialLearnFromMath1791C().isPrime(n - i);
            if(!p1 && !p2) {
                System.out.println(i +" "+ (n - i));
                return;
            }
        }
    }
}

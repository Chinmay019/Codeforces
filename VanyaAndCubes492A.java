import java.util.Scanner;

public class VanyaAndCubes492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        long tot = 0;
        while(true) {
            tot += ((long) i * (i + 1)) / 2;
            if(tot > n) {
                break;
            }
            i++;
        }
        System.out.println(i - 1);
    }
}

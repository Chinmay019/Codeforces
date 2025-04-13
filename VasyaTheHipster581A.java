import java.util.Scanner;

public class VasyaTheHipster581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        int diff = Math.min(red, blue);
        int max = Math.max(red, blue);
        System.out.println(diff + " " + (max - diff) / 2);
    }
}

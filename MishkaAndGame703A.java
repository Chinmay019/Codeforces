import java.util.Scanner;

public class MishkaAndGame703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0, c = 0;
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b)
                m++;
            else if(a < b)
                c++;
        }
        if(m == c) {
            System.out.println("Friendship is magic!^^");
        } else if (m > c) {
            System.out.println("Mishka");
        } else {
            System.out.println("Chris");
        }
    }
}

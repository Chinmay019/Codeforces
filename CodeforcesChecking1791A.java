import java.util.Scanner;

public class CodeforcesChecking1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = "codeforces";
        while(n-- > 0) {
            String s = sc.next();
            if(c.contains(s)) {
                System.out.println("yes");
            } else {
                System.out.println("NO");
            }
        }
    }
}

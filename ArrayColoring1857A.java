import java.util.Scanner;

public class ArrayColoring1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            if(sum % 2 == 0)
                System.out.println("Yes");
            else
                System.out.println("no");
        }
    }
}

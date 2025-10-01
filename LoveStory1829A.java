import java.util.Scanner;

public class LoveStory1829A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String inp = sc.next();
            String comp = "codeforces";
            int count = 0;
            for(int i = 0; i < 10; i++) {
                if(inp.charAt(i) != comp.charAt(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

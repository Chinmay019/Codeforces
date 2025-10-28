import java.util.Scanner;

public class NightAtTheMuseum731A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        char current = 'a';
        for(char ch : s.toCharArray()) {
            int counter = (ch - current + 26) % 26;
            sum += Math.min(26 - counter, counter);
            current = ch;
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class TrippiTroppi2094A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            String[] words=  s.split(" ");
            StringBuilder ans = new StringBuilder();
            for(String word: words) {
                ans.append(word.charAt(0));
            }
            System.out.println(ans);
        }
    }
}

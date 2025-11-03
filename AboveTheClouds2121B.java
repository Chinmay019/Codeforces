import java.util.Scanner;

public class AboveTheClouds2121B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] freq = new char[26];
            for(char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            boolean contains = false;
            for(int i = 0; i < 26; i++) {
                if(freq[i] >= 3) {
                    contains = true;
                } else if(freq[i] == 2 && (s.charAt(0) - 'a' != i || s.charAt(n - 1) - 'a' != i)) {
                    // if freq is 2 , and it's literally the first and last characters => then not possible
                    // else
                    contains = true;
                }
            }
            if(contains) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

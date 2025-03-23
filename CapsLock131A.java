import java.util.Scanner;

public class CapsLock131A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if (isAllCaps(s)) {
            System.out.println(s.toLowerCase());
        } else if (isFirstCharLower(s)) {
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < n; i++) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            System.out.println(sb);
        } else {
            System.out.println(s);
        }
    }

    public static boolean isAllCaps(String s) {
        int n = s.length();
        int capsCount = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                capsCount++;
        }
        return capsCount == n;
    }

    public static boolean isFirstCharLower(String s) {
        int n = s.length();
        int capsCount = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                capsCount++;
        }
        return capsCount == (n - 1) && Character.isLowerCase(s.charAt(0));
    }
}

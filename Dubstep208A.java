import java.util.Scanner;

public class Dubstep208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("WUB");
        for(String s1 : arr) {
            if(!s1.isEmpty())
                System.out.print(s1 + " ");
        }
    }
}

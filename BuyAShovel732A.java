import java.util.Scanner;

public class BuyAShovel732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        if(k % 10 == 0) {
            System.out.println('1');
            return;
        }
        for(int i = 1; i <= 9; i++) {
            if(((k % 10) * i) % 10 == r || ((k % 10) * i) % 10 == 0){
                System.out.println(i);
                return;
            }
        }
    }
}

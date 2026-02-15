import java.util.Scanner;

public class Square1921A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int[][] arr = new int[4][2];
            for(int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int x = arr[0][0];
            int y = arr[0][1];
            for (int i = 1; i < 4; i++) {
                if(arr[i][0] == x || arr[i][1] == y) {
                    int side = (x - arr[i][0]) | (y - arr[i][1]);
                    System.out.println(side * side);
                    break;
                }
            }
        }
    }
}
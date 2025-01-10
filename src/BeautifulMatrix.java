package src;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int row = -1, col = -1;

        for(int i = 0; i < 5; i++ ) {
            for(int j = 0; j < 5; j++ ) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }

        int ans = Math.abs(2 - row) + Math.abs(2- col);

        System.out.println(ans);
    }
}

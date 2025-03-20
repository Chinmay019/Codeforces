package src;

import java.util.Scanner;

public class QueueAtSchool266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        String q = sc.next();
        char[] arr = q.toCharArray();

        for(int i = 0; i < time; i++) {
            for(int j = 1; j < n; j++ ) {
                if(arr[j] == 'G' && arr[j-1] == 'B') {
                    // swap indexes in arr
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j++;
                }
            }
        }
        String ans = new String(arr);
        System.out.println(ans);
    }
}

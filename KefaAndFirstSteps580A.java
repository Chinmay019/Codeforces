import java.util.Scanner;

public class KefaAndFirstSteps580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }
        int maxLength = 0, runningMaxLen = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++ ) {
            if(arr[i] < maxValue) {
                runningMaxLen = 1;
                maxValue = arr[i];
            } else {
                maxValue = arr[i];
                runningMaxLen += 1;
            }
            maxLength = Math.max(maxLength, runningMaxLen);
        }
        System.out.println(maxLength);
    }
}

package src;

import java.util.Scanner;

public class Hulk705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while(i <= n) {
            if(i % 2 == 1) {
                sb.append("I hate ");
            } else {
                sb.append("I love ");
            }
            if(i < n){
                sb.append("that ");
            }
            i++;
        }
        sb.append("it");
        System.out.println(sb);
    }
}

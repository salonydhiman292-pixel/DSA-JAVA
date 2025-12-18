package array;

import java.util.Scanner;

public class leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result=new int[n];
        System.out.println("enter your number");


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxFromRight = arr[n - 1];


        System.out.print(maxFromRight + " ");


        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}

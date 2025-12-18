package array;

import java.util.Arrays;
import java.util.Scanner;

public class moveNegativeNoToLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
       int[] result=new int[n];
        System.out.println("enter your number");


        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
//

//
        int k = 0;

        // put negative numbers first
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[k++] = arr[i];
            }
        }

        // then put non-negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

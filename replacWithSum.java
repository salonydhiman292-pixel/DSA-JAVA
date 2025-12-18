package array;

import java.util.Arrays;
import java.util.Scanner;

public class replacWithSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] result=new int[n];
        System.out.println("enter your number");


        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
        }
        int k=0;
        for (int i = 0; i <n ; i++) {
           result[k]=sum-arr[i] ;
           k++;
        }
        System.out.println(Arrays.toString(result));
    }
}

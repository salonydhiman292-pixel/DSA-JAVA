package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayKSteps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();

        k=k%n;
        int[] result=new int[n];

        for (int i = 0; i <k ; i++) {
            result[i]=arr[n-k+i];


        }

        for (int i = k; i <n ; i++) {
            result[i]=arr[i-k];

        }
        System.out.println(Arrays.toString(result));
    }
}

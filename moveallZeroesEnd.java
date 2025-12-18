package array;

import java.util.Arrays;
import java.util.Scanner;

public class moveallZeroesEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] result=new int[n];
        System.out.println("enter your number");


        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
//    int noofZero=0;
//        for (int i = 0; i <n ; i++) {
//            if(arr[i]==0)
//                noofZero++;
//
//        }
//        for (int i = n; i >noofZero ; i++) {
//            result[i]=0;
//
//
//        }
       int k=0;
        for (int i =0; i <n; i++) {
            if (arr[i] != 0) {
                result[k] = arr[i];
                k++;
            }

        }
            System.out.println(Arrays.toString(result));

    }
}

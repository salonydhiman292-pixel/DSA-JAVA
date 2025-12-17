package array;

import java.util.Arrays;
import java.util.Scanner;

public class nestGreatestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();

        }

        int max=-1;
//        int j=n-1;
//       int i=0;
//        while(j>0) {
        for (int i = n-1; i >=0 ; i--) {
            int temp = arr[i];
            arr[i] = max;


            if (temp > max){
                max = temp;
        }
        }
        System.out.println(Arrays.toString(arr));
        }

    }


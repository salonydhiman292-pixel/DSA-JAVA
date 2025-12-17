package array;

import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] arr3=new int[2*n];
        for (int i = 0; i <n ; i++) {
            arr1[i]=sc.nextInt();

        }
        for (int i = 0; i <n ; i++) {
            arr2[i]=sc.nextInt();
        }


        int i=0,j=0,k=0;
        while(i<n && j<n) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            arr3[k++] = arr1[i++];
        }


        while (j < n) {
            arr3[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(arr3));
    }
}

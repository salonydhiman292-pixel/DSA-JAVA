package array;

import java.util.Arrays;
import java.util.Scanner;

public class sortTheArray0And1Method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int temp=0;


        int i=0;
        int j=n-1;
        while(i<j) {
            if (arr[i] == 0) {i++;}
            else if (arr[j] == 1) {j--;}

            else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

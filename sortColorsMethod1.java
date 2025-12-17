package array;

import java.util.Arrays;
import java.util.Scanner;

public class sortColorsMethod1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int noofZeroes=0;
        int noofOnes=0;
        int noOfTwos=0;

        for (int i = 0; i <n; i++) {
            if(arr[i]==0)
                noofZeroes++;
            else if(arr[i]==1) noofOnes++;
             else noOfTwos++;
        }
        for (int i = 0; i <noofZeroes ; i++) {
            arr[i]=0;
        }
        for (int i = noofZeroes; i <noofZeroes+noofOnes; i++) {
            arr[i]=1;
        }
        for(int i=noofOnes+noofZeroes;i<n;i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }

}

package array;

import java.util.Scanner;

public class secondLLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();

        if (n < 2) {
            System.out.println("Second largest not possible");
            return;
        }
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }


        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i] ) {
                max = arr[i];
            }


        }



        int smax=Integer.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=max ) {
                smax=Math.max(smax,arr[i]);
                found = true;
            }


        }

        System.out.println("maximum value is "+ max);

        if (found) {
            System.out.println("Second maximum value is " + smax);
        } else {
            System.out.println("Second maximum does not exist");
        }
    }
}

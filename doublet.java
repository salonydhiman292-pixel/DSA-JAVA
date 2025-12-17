package array;

import java.util.Scanner;

public class doublet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter your target");
        int target=sc.nextInt();
        System.out.println("enter your array");

        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n ; j++) {
               if (arr[i]+arr[j]==target){
                   System.out.println("indexes are (" + i + ", " + j + ")");

//                   System.out.println("indexes are "+i+j);
               }

            }

        }

        }
}

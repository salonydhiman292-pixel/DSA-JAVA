package array;

import java.util.Scanner;

public class missingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter your number");


        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();


        }
           boolean missing=false;
        int k=1;
        for (int i = 0; i <n ; i++) {
//            int d = arr[i + 1] - arr[i];
            if (arr[k] - arr[i]>1) {
               missing=true;
               k++;
            }

            if (!missing){
                System.out.println(i);
            }
        }
    }
}

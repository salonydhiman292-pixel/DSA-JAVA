package array;

import java.util.Scanner;

public class intersectionofArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n = sc.nextInt();
        System.out.println("array 1");
        int[] arr = new int[n];
        System.out.println("array 2");
        int[] arr2 = new int[n];

        System.out.println("enter your number");


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();


        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println(arr[i]);
                    break;

                }
            }
        }
    }

}



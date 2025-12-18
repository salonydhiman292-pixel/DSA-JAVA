package array;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) continue;
            boolean duplicate=false;

            for (int j = i + 1; j < n; j++) {


                if (arr[i] == arr[j]) {
                    duplicate = true;
                    arr[j] = -1;
                }
            }

            if (duplicate) {
                System.out.println(arr[i]);
            }
        }

    }
}

package array;

import java.util.Scanner;

public class marksofstudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < 35) {
                System.out.println("Student " + (i + 1) + " failed");
            }
        }


    }
}

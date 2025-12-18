package array;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
//        int[] result=new int[n];
        System.out.println("enter your number");


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;
        boolean ispalindrome = true;
        while (i < j) {
            if (arr[i] != arr[j]) {
                ispalindrome = false;}
                i++;
                j--;



        }
        if(!ispalindrome){
            System.out.println("not palindrome");
        }
        else System.out.println("palindrome");
    }
}

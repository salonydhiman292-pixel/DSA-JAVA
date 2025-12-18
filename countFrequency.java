package array;

import java.util.Arrays;
import java.util.Scanner;

public class countFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];



        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i <n; i++) {
            if (arr2[i] == -1) continue;

            int sum=1;
            for (int j = i+1; j <n ; j++) {

                if(arr[i]==arr[j]){
                    sum++;
                    arr2[j] = -1;

                }

            }
            arr2[i] = sum; }
            System.out.println(Arrays.toString(arr2));


    }
}

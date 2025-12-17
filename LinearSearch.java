package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter your number");
        int x=sc.nextInt();

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag=false;
        for (int i = 0; i <n ; i++)
            {
                if (arr[i] == x) {
                    System.out.println("element found");
                    flag = true;
                    break;
                }

                }
              if(!flag){
                  System.out.println("not found");
              }

        }
    }


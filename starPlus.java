package PatternPrinting;

import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
//         n should be odd
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your number");
        int n=sc.nextInt();
         int mid=n/2 +1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++) {
//                int mid=n%2 + 1;
                if (i == mid || j == mid)


                    System.out.print("*");
                else
                    System.out.print("0");
                }

                System.out.println();

            }
        }

}

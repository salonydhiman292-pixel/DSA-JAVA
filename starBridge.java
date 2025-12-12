package PatternPrinting;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int m = sc.nextInt();
        for (int i = 1; i <=2*m-1 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        m--;
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <=m+1-i ; j++) {
                    System.out.print("*");

                }
                for (int j = 1; j <=2*i-1 ; j++) {
                    System.out.print(" ");

                }
                for (int j = 1; j <=m+1-i ; j++) {
                    System.out.print("*");

                }

                System.out.println();

        }
    }
}

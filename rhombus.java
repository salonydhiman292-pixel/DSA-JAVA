package PatternPrinting;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int m = sc.nextInt();
//        System.out.println("enter column");
//        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j < m+1-i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=m ; j++) {
                System.out.print("*");

            }
//            for (int j = 1; j <m; j++) {
//                if ((i + j) > m)
//                    System.out.print("#");
//                else System.out.print(" ");
//
//            }
            System.out.println();

        }

    }
}

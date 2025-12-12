package PatternPrinting;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int m = sc.nextInt();
//        System.out.println("enter column");
//        int n = sc.nextInt();
            int n=1;
        for (int i = 1 ;i <= m; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(n);
                n=n+1;


            }
            System.out.println();

        }
    }
}

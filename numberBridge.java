package PatternPrinting;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int m = sc.nextInt();

        for (int i = 1; i <=2*m-1 ; i++) {
            System.out.print(i);

        }
        System.out.println();
        m--;
        int nsp=1;
        for (int i = 1; i <=m ; i++) {
            int a=1;
            for (int j = 1; j <=m+1-i ; j++) {
                System.out.print(a++);

            }
            for (int j = 1; j <=nsp ; j++) {
                System.out.print(" ");
                a++;

            }
            nsp+=2;
            for (int j = 5; j <=m+5-i ; j++) {
                System.out.print(a++);

            }
            System.out.println();

        }
    }
}

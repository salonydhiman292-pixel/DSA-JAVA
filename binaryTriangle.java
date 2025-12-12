package PatternPrinting;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
// method 01
//                if (i % 2 == 1) {
//
//                    if (j % 2 == 1) {
//
//
//                        System.out.print("1");
//                    } else {
//                        System.out.print("0");
//                    }
////                    System.out.println();
//                } else {
//                    if (j % 2 == 0)
//                        System.out.print("1");
//                    else System.out.print("0");
//                }
//            } System.out.println();

//                method second
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

                }
                System.out.println();
            }
        }

}

package PatternPrinting;

import java.util.Scanner;

public class sequenceOfLetterAndAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int m = sc.nextInt();
//        System.out.println("enter column");
//        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (j + 64));
//                    System.out.println();
                } else {
                    System.out.print(j);
//                    System.out.print();
                }
//                System.out.println();

            }
            System.out.println();
        }

    }
}
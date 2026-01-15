package TwoDimensionalArray;

import java.util.Scanner;

public class StoreRollNoMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] table=new int[4][2];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <2 ; j++) {
                table[i][j]=sc.nextInt();

            }

        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(table[i][j]+" ");

            }
            System.out.println();

        }

    }
}

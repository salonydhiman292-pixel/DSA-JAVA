package loops;

import java.util.Scanner;

public class evenNo1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();

        for (int i = 2; i <=n; i=i+2) {
            System.out.print(i+" ");

        }
    }
}

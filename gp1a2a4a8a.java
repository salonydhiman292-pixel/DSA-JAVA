package loops;

import java.util.Scanner;

public class gp1a2a4a8a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your numbrer");
        int n= sc.nextInt();
            int a=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=2;
        }
    }
}

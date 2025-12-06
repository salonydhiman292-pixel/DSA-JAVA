package loops;

import java.util.Scanner;

public class ap4a7a10a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your numbrer");
        int n= sc.nextInt();

        for(int i=4;i<=3*n+1;i=i+3){
            System.out.println(i);
        }
    }
}

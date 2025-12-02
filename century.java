package conditionals;

import java.util.Scanner;

public class century {
    public static void main(String[] args) {
        System.out.println("enter your year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(year%100==0){
            System.out.println("century year");
        }
        else System.out.println("not a century year");
    }
}

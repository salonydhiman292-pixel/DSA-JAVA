package ifelse;

import java.util.Scanner;

public class threeDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();

        if(num>99 && num<1000){
            System.out.println("three digit number");
        }
        else{
            System.out.println("not a three digit number");
        }
    }
}

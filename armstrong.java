package conditionals;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your number");
        int number=sc.nextInt();
        int sum=0;
        int original=number;

        int n=String.valueOf(number).length();

        while(number>0){
            int digit=number%10;

//            sum=sum+(digit*digit*digit);
            sum+=Math.pow(digit,n);
            number=number/10;

        }

        if(sum==original){
            System.out.println("number is armstrong");
        }
        else
            System.out.println("number is not armstrong number");

    }
}

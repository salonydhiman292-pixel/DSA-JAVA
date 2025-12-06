package loops;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
       int n=sc.nextInt();
//          if(n<=1)
//              System.out.println("not prime nor coprime number");
//
//          boolean isComposite=false;
//        for(int i=2;i<n;i++){
//            if(n%i==0)
//                isComposite=true;
//            break;
////            else
////               System.out.println("number is prime no.");
////            break;
//            if(isComposite) System.out.println("Composite Number");
//            else System.out.println("prime number");
        if (n <= 1) {
            System.out.println("not prime nor composite");
            return;
        }

        boolean isComposite = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite)
            System.out.println("Composite number");
        else
            System.out.println("Prime number");
        }
    }


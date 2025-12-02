package conditionals;

import java.util.Scanner;

public class primeOrComposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");

        int no=sc.nextInt();

        if(no<=1){
            System.out.println("neither prime no.,nor composite number");
            return;
        }
        boolean isPrime=true;

        for(int i=2;i<no;i++){
            if(no%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println("prime number");
        else System.out.println("composite number");
    }
}

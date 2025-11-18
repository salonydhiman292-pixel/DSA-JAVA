package ifelse;

import java.util.Scanner;

public class largestFromTHree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. a");
        int a=sc.nextInt();
        System.out.println("enter no.b");
        int b=sc.nextInt();
        System.out.println("enter no. c");
        int c=sc.nextInt();

        if(a>b && a>c){
           System.out.println("a is greater than other two");
        }
        else if(b>c){
            System.out.println("b is greater than other two");
        }
        else{
            System.out.println("c is greater than two");
        }
    }
    
}

package conditionals;

import java.util.Scanner;

public class calculaorifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first");
        int a= sc.nextInt();

        System.out.println("enter second");
        int b=sc.nextInt();

        System.out.println("enter character");
        char op=sc.next().charAt(0);

        if(op=='+')
            System.out.println(a+b);
        else if(op=='-')
            System.out.println(a-b);
        else if(op=='*')
            System.out.println(a*b);
        else if(op=='/') {
            if (b != 0)
                System.out.println(a / b);
            else System.out.println("cannot divide by zero");

        }
        else
            System.out.println("op is invalid");
    }
}

package conditionals;

import java.util.Scanner;

public class triangletypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first side");
        int a=sc.nextInt();
        System.out.println("enter second side");
        int b= sc.nextInt();
        System.out.println("enter third side");
        int c=sc.nextInt();


        if(a+b>c && b+c>a && c+a>b){
            if(a==b && b==c){
                System.out.println("valid and equilateral triangle");
            }
            else if(a!=b && b!=c && c!=a){
                System.out.println("valid and scalene triangle");
            }
            else System.out.println("valid and isoceles triangle");
        }

        else System.out.println("invalid triangle");
    }
}

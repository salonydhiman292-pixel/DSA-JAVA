package conditionals;

import java.util.Scanner;

public class triangleorNot {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter first side");
        int first=sc.nextInt();

        System.out.println("enter second side");
        int second=sc.nextInt();

        System.out.println("enter third side");
        int third = sc.nextInt();

        if(first+second>third  && second+third>first && third+first>second){
            System.out.println("triangle is valid");
        }
        else
            System.out.println("triangle is invalid");
    }
    }


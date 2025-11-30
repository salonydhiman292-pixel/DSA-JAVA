package conditionals;

import java.util.Scanner;

public class rightangledtriangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter first angle of a triangle");
        int a=sc.nextInt();

        System.out.println("enter second angle of a triangle");
        int b=sc.nextInt();

        System.out.println("enter third angle of a triangle");
        int c=sc.nextInt();


            if(a+b+c==180) {
                if (a == 90 || b == 90 || c == 90) {
                    System.out.println("valid and right angles triangle ");
                }
                else System.out.println("not a right triangle");
            }


        else  System.out.println("not valid and not a right angled triangle");
    }
}

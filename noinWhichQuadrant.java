package conditionals;

import java.util.Scanner;

public class noinWhichQuadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter x digit");
        int x=sc.nextInt();

        System.out.println("enter y digit");
        int y=sc.nextInt();

        if(x>0 && y>0){
            System.out.println("first quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("second quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("third quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("forth quadrant");
        }
        else System.out.println("point is on origin");
    }
}

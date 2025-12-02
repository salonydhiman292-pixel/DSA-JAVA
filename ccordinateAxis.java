package conditionals;

import java.util.Scanner;

public class ccordinateAxis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter x coordinate");
        int x=sc.nextInt();
        System.out.println("enter y coordinate");
        int y=sc.nextInt();

        if(x==0 && y==0){
            System.out.println("coordinate at origin");
        }
        else if (x!=0 && y==0){
            System.out.println("coordinate at x axis");
        }
        else if(x==0 && y!=0){
            System.out.println("coordinate at y axis ");
        }
        else
            System.out.println("coordinate present inside the quadrants ");
    }
}

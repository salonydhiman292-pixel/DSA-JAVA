package ifelse;

import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();

        if(num>=0){
            System.out.println(num);
        }
        else{
            System.out.println(-(num));
            // System.out.println(-*num);
        }
    }
}

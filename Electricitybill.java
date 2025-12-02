package conditionals;

import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter units");

        int units=sc.nextInt();
        int amount=0;

        if(units<=100){
            amount=units*5;
        }

        else if(units<=200){
            amount=(100*5)+(units-100)*7;
        }

        else{
            amount=(100*5)+(100*7)+(units-200)*10;
        }
            System.out.println("Electricity Bill will be"+amount);
    }
}

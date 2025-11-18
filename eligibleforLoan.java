package ifelse;

import java.util.Scanner;

public class eligibleforLoan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your salary");
        int salary = sc.nextInt();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("enter your score");
        int score=sc.nextInt();

        if(salary>50000){
            if(age>18){
                if(score>5){
                    System.out.println("you are eligible for loan as you are fixed in every category");
                }
                else System.out.println("you are not eligible as your score is less than 6");
            }
            else System.out.println("you are not eligible for loan as your age is less than 19");
        }
        else System.out.println("you are not eligible as your salary is not come in our category");
    }
}

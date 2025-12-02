package conditionals;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your BMI");
        double bmi = sc.nextDouble();



        if(bmi<18.5)
            System.out.println("underweight");
        else if(bmi>=18.5 && bmi<=24.9)
            System.out.println("normal condition");
        else if(bmi>=25 && bmi<=29.9)
            System.out.println("overweight");
        else if(bmi>=30 && bmi<=34.9)
            System.out.println("obesity class1");
        else if(bmi>=35 && bmi<=39.9)
            System.out.println("obesity class2");
        else
            System.out.println("obesity class3");
    }
}

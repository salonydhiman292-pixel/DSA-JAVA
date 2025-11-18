package ifelse;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");

        int marks=sc.nextInt();

        if(marks>=90){
            System.out.println("grade is A");
        }
        else if(marks<90 && marks>=80){
            System.out.println("grade is B");
        }
         else if(marks<80 && marks>=70){
            System.out.println("grade is C");
        }
         else if(marks<70 && marks>=60){
            System.out.println("grade is D");
        }
         else if(marks<60 && marks>=50){
            System.out.println("grade is E");
        }
        else {
            System.out.println("fail");
        }
    }
}

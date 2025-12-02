package conditionals;

import java.util.Scanner;

public class gradeAsPerMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter marks of first subject");
        int first= sc.nextInt();

        System.out.println("enter marks of second subject");
        int second= sc.nextInt();

        System.out.println("enter marks of third subject");
        int third= sc.nextInt();

        System.out.println("enter marks of forth subject");
        int forth= sc.nextInt();

        System.out.println("enter marks of fifth subject");
        int fifth= sc.nextInt();

        int sum=first+second+third+forth+fifth;

        double percentage=sum/5.0;

        if(percentage>=90)
            System.out.println("grade is A+");
        else if(percentage>=80)
            System.out.println("grade is A");
        else if(percentage>=70)
            System.out.println("grade is B");
        else if(percentage>=60)
            System.out.println("grade is C");
        else
            System.out.println("fail");


    }
}

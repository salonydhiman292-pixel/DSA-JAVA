package conditionals;

import java.util.Scanner;

public class validatedate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter date");
        int dd=sc.nextInt();
        System.out.println("enter month");
        int mm=sc.nextInt();
        System.out.println("enter year");
        int yyyy=sc.nextInt();


            if (dd >= 1 && dd <= 31 && mm >= 1 && mm <= 12 && yyyy >= 1) {

                System.out.println("date is valid"+" "+dd+"/"+mm+"/"+yyyy);
        }
        else
                 System.out.println("date is invalid");
    }
}

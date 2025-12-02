package conditionals;

import java.util.Scanner;

public class withrowandBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter withrow");
        int withdrow=sc.nextInt();
        System.out.println("enter balance");
        int balance=sc.nextInt();

        if(withdrow<=balance){
            balance=balance-withdrow;
            System.out.println("balance is"+balance);
            System.out.println("amount is "+ withdrow);
        }
        else
            System.out.println("error");
    }
}

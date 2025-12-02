package conditionals;

import java.util.Scanner;

public class APAndGP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. a");
        int a=sc.nextInt();
        System.out.println("enter no. b");
        int b=sc.nextInt();
        System.out.println("enter no. c");
        int c=sc.nextInt();

        if((b-a)==(c-b)){
            System.out.println("numbers are in AP");
        }
        else if((a!=0) && (b!=0) && (b/a == c/b)) {
            System.out.println("numbers are in GP");
        }
        else
            System.out.println("nether in AP nor in GP");
    }
}

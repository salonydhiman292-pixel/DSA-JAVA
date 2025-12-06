package loops;

import java.util.Scanner;

public class divideby3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                System.out.print(i+" ");
        }
    }
}

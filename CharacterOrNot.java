package conditionals;

import java.util.Scanner;

public class CharacterOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your Character");

        char ch=sc.next().charAt(0);

        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println("given thing is Character");
        }
        else System.out.println("given thing is not charachter");
    }
}

package conditionals;

import java.util.Scanner;

public class checkCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character");

        char ch=sc.next().charAt(0);

        if(ch>='a' && ch<='z')
            System.out.println("lowercase");
        else if(ch>='A' && ch<='Z')
            System.out.println("UpeerCase");
        else if(ch>='0' && ch<='9')
            System.out.println("Digit");
        else
            System.out.println("special character");
    }
}

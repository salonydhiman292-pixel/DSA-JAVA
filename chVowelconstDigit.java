package conditionals;

import java.util.Scanner;

public class chVowelconstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter character");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("character is digit");
        }
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("character is vowel");}
            else System.out.println("character is consonent");
        }

        else
    {
        System.out.println("charachter is symbol");
    }
}
        }

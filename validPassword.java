package conditionals;

import java.util.Scanner;

public class validPassword {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8)
            return false;

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }
        return hasLower && hasDigit && hasSpecial && hasUpper;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");

        String password=sc.nextLine();

        boolean result= isValidPassword(password);

        System.out.println(result);
    }
}

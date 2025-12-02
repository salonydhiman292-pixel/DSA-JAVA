package conditionals;

import java.util.Scanner;

public class validIdentifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your identifier");
        String s = sc.next();

        String[] keywords = {
                "int","class","public","private","protected","static","void","if","else",
                "for","while","do","switch","case","break","continue","return","new",
                "try","catch","finally","throw","throws","import","package","extends",
                "implements","this","super","true","false","null"
        };


        for (String k : keywords) {
            if (s.equals(k)) {
                System.out.println("invalid identifier (keyword)");
                return;
            }
        }


        char first = s.charAt(0);
        if (!(Character.isLetter(first) || first == '_' || first == '$')) {
            System.out.println("invalid identifier (invalid first character)");
            return;
        }


        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!(Character.isLetterOrDigit(ch) || ch == '_' || ch == '$')) {
                System.out.println("invalid identifier (invalid character found)");
                return;
            }
        }

        System.out.println("valid identifier");
    }
}

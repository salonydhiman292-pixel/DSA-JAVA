package conditionals;

import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. first");
        int a = sc.nextInt();

        System.out.println("enter no. second");
        int b = sc.nextInt();

        System.out.println("enter operator");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("calculator is invalid");
        }
    }
}

package conditionals;

import java.util.Scanner;

public class timehour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hour");
        int hour = sc.nextInt();

        if (hour >= 5 && hour <= 11) {
            System.out.println("good morning");
        } else if (hour > 11 && hour < 16) {
            System.out.println("good afternoon");
        } else if (hour >= 16 && hour <= 20) {
            System.out.println("good evening");
        } else if (hour <= 23 && hour >= 0) {
            System.out.println("good night");
        } else System.out.println("invalid time");
    }
}

package array;
import java.util.Scanner;

public class secondLargestFromOneLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second largest not possible");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                smax = max;
                max = arr[i];
                found = true;
            }
            else if (arr[i] < max && arr[i] > smax) {
                smax = arr[i];
                found = true;
            }
        }

        System.out.println("Maximum value is " + max);

        if (found) {
            System.out.println("Second maximum value is " + smax);
        } else {
            System.out.println("Second maximum does not exist");
        }
    }
}

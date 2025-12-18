package array;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int k=0;
        for (int i = 0; i <n ; i++) {
//            if (arr[i] == -1) continue;
            boolean duplicate = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == arr2[j]) {

                    duplicate = true;
                    break;
                }
            }

//                   arr2[i] = arr[i];
//                    arr[j] = -1;

//                }

//            }
            if (!duplicate) {
                arr2[k] = arr[i];
                k++;
            }
        }

    System.out.println(Arrays.toString(arr2));
}
//        }

//    }
}

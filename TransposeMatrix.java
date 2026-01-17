package TwoDimensionalArray;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        int[][] arr1=new int[2][3];

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr1[i][j]=arr[j][i];
            }

        }

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}

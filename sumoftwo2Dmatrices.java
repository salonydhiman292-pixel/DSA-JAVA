package TwoDimensionalArray;

public class sumoftwo2Dmatrices {
    public static void main(String[] args) {
        int[][] a={{1,9,2},{3,7,4},{8,5,6}};
        int[][] b={{9,3,7},{8,6,5},{2,4,1}};
        int[][] sum=new int[3][3];

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                sum[i][j]=a[i][j]+b[i][j];

            }

        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

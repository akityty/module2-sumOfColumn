import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input row amout ");
        int row = scanner.nextInt();
        System.out.println("inpt column amout ");
        int col = scanner.nextInt();
        double[][] arr = new double[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("a[" + i + "][" + j + "]= ");
                arr[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the column you want to sum ");
        int sumCalculationColumn = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if( j==sumCalculationColumn){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix Addition
        System.out.println("Matrix Addition");
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication
        System.out.println("\nMatrix Multiplication");

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] m1 = new int[r1][c1];
            int[][] m2 = new int[r2][c2];
            int[][] product = new int[r1][c2];

            System.out.println("Enter first matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }

            System.out.println("Multiplication of matrices:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

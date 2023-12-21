import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix (Mat1)
        System.out.println("Enter the dimensions of the first matrix (Mat1):");
        System.out.print("Rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Columns: ");
        int cols1 = scanner.nextInt();

        int[][] mat1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix (Mat1):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        // Input for the second matrix (Mat2)
        System.out.println("Enter the dimensions of the second matrix (Mat2):");
        System.out.print("Rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Columns: ");
        int cols2 = scanner.nextInt();

        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix (Mat2):");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        // Check if matrix multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Columns of Mat1 must be equal to rows of Mat2.");
        } else {
            // Perform matrix multiplication
            int[][] result = multiplyMatrices(mat1, mat2);

            // Display the result
            System.out.println("Resultant matrix after multiplication:");
            displayMatrix(result);
        }

        scanner.close();
    }

    // Function to perform matrix multiplication
    private static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

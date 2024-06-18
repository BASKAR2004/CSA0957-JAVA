import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of matrix1:");
        enterMatrixElements(matrix1, scanner);

        System.out.println("Enter elements of matrix2:");
        enterMatrixElements(matrix2, scanner);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("(g) Addition of Matrices");
            System.out.println("(h) Subtraction of Matrices");
            System.out.println("(i) Multiplication of Matrices");
            System.out.println("(j) Transpose of Matrix");
            System.out.println("(k) Inverse of Matrix (not implemented)");
            System.out.println("(l) Sum of diagonal elements of Matrix");
            System.out.println("(q) Quit");

            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'g':
                    displayMatrix(addMatrices(matrix1, matrix2));
                    break;
                case 'h':
                    displayMatrix(subtractMatrices(matrix1, matrix2));
                    break;
                case 'i':
                    displayMatrix(multiplyMatrices(matrix1, matrix2));
                    break;
                case 'j':
                    System.out.println("Transpose of matrix1:");
                    displayMatrix(transposeMatrix(matrix1));
                    System.out.println("Transpose of matrix2:");
                    displayMatrix(transposeMatrix(matrix2));
                    break;
                case 'k':
                    System.out.println("Inverse of matrices (not implemented)");
                    break;
                case 'l':
                    System.out.println("Sum of diagonal elements of matrix1: " + sumDiagonal(matrix1));
                    System.out.println("Sum of diagonal elements of matrix2: " + sumDiagonal(matrix2));
                    break;
                case 'q':
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        }
    }

    // Method to enter elements of a matrix
    public static void enterMatrixElements(int[][] matrix, Scanner scanner) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to calculate the sum of diagonal elements of a matrix
    public static int sumDiagonal(int[][] matrix) {
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Assuming it's a square matrix (rows == cols)
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i]; // Summing diagonal elements
        }

        return sum;
    }
}

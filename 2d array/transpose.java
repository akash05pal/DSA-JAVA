import java.util.Scanner;

public class transpose {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] matrix = new int[rows][col];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The original matrix is:");
        printMatrix(matrix);

        System.out.println("The transpose of the matrix is:");
        for(int j = 0; j < col; j++) {
            for(int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

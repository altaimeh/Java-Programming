import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void read_matrix_1(int[][] temp_matrix1) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------\n");
        System.out.println("Please enter values for Matrix 1: ");
        for(int d = 0; d < temp_matrix1.length; d++) {
            for(int e = 0; e < temp_matrix1[d].length; e++) {
                temp_matrix1[d][e] = input.nextInt();
            }
        }
        System.out.println("Your matrix is: \n");
        System.out.println("| " + Arrays.deepToString(temp_matrix1) + " |");
    }

    public static void read_matrix_2(int[][] temp_matrix2) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------\n");
        System.out.println("Please enter values for Matrix 2: ");
        for(int d = 0; d < temp_matrix2.length; d++) {
            for(int e = 0; e < temp_matrix2[d].length; e++) {
                temp_matrix2[d][e] = input.nextInt();
            }
        }
        System.out.println("Your matrix is: \n");
        System.out.println("| " + Arrays.deepToString(temp_matrix2) + " |");
    }

    public static void multiply_matrix(int rowSize1, int colSize2, int colSize1, int[][] result, int[][] temp_matrix1, int[][] temp_matrix2) {
        for(int a = 0; a < rowSize1; a++) {
            for(int b = 0; b < colSize2; b++) {
                for(int c = 0; c < colSize1; c++) {
                    result[a][b] += temp_matrix1[a][c]*temp_matrix2[c][b];
                }
            }
        }
        System.out.println("Your resulting matrix is: \n");
        System.out.println("| " + Arrays.deepToString(result) + " |");
    }


    public static void main(String[] args) {
        System.out.println("Hi there! Welcome to Java Matrix Multiplication\n");
        System.out.println("------------------------------------------------\n");
        System.out.println("Please enter integer dimensions for Matrix 1: ");
        System.out.println("------------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter row size for Matrix 1: \n");
        System.out.println("------------------------------------------------\n");
        int rowSize1 = input.nextInt();
        
        System.out.println("Please enter column size for Matrix 1: \n");
        System.out.println("------------------------------------------------\n");
        int colSize1 = input.nextInt();
        
        System.out.println("Please enter row size for Matrix 2: \n");
        System.out.println("------------------------------------------------\n");
        int rowSize2 = input.nextInt();
        
        System.out.println("Please enter column size for Matrix 2: \n");
        System.out.println("------------------------------------------------\n");
        int colSize2 = input.nextInt();
        if (colSize1 != rowSize2) {
            System.out.println("Error! Cannot multiply these matrices!");
            System.out.println("Please try again!");
            System.exit(1);
        }

        int[][] temp_matrix1 = new int[rowSize1][colSize1];
        int[][] temp_matrix2 = new int[rowSize2][colSize2];

        read_matrix_1(temp_matrix1);
        read_matrix_2(temp_matrix2);
        int[][] result = new int[rowSize1][colSize2];
        multiply_matrix(rowSize1, colSize2, colSize1, result, temp_matrix1, temp_matrix2);

    }
}

package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int[][] matrix_temp;

    Matrix() {
        matrix_temp = new int[3][4];
    }

    Matrix add_matrices(Matrix temp_input) {
        Matrix input = new Matrix();
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 4; b++) {
                input.matrix_temp[a][b] = matrix_temp[a][b] + temp_input.matrix_temp[a][b];
            }
        }
        return input;
    }

    void print_add_matrix() {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print(matrix_temp[a][b] + "\t");
            }
            System.out.println();
        }
    }

    void random_matrix() {
        Random random_matrix_temp = new Random();
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 4; b++) {
                matrix_temp[a][b] = random_matrix_temp.nextInt(25);
                System.out.print(matrix_temp[a][b] + "\t");
            }
            System.out.println();
        }
    }

    public void read_matrix_1(int[][] temp_matrix1) {
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

    public void read_matrix_2(int[][] temp_matrix2) {
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
}

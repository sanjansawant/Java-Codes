package com.Sanjan;


import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int m, n, p, q, sum = 0;

        System.out.println("Enter the number of rows and columns of first matrix");
        m = input.nextInt();
        n = input.nextInt();
        int[][] matrix1 = getMatrix(m, n);

        System.out.println("Enter the number of rows and columns of Second matrix");
        p = input.nextInt();
        q = input.nextInt();

        if (n != p) {
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        } else {
            int[][] matrix2 = getMatrix(p, q);

            int[][] multiply = new int[m][q];


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < p; k++) {

                        sum = sum + matrix1[i][k] * matrix2[k][j];

                    }
                    multiply[i][j] = sum;
                    sum = 0;
                }
            }


            System.out.println("Product of entered matrices:-");

            for (int c = 0; c < m; c++) {
                for (int d = 0; d < q; d++)
                    System.out.print(multiply[c][d] + "\t");

                System.out.print("\n");
            }


        }

    }


    public static int[][] getMatrix(int m, int n) {
        int[][] matrix1 = new int[m][n];

        System.out.println("Enter the elements of 1st matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();

            }

        }
        return matrix1;


    }

}

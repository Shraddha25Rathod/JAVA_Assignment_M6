package com.practice;
import java.util.Scanner;
public class MatrixOperations
{
	public static void main(String[] args) 
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
        int rows = Scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = Scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        int[][] difference = new int[rows][columns];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix1[i][j] = Scanner.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++)
            {
                matrix2[i][j] = Scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Matrix Addition (Sum):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix Subtraction (Difference):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
	}
}

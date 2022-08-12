package EXERCISES.LE06_Exercise_Multidimensional_Arrays;

import java.util.Scanner;

public class P03_Diagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int [][] matrix = new int [size][size];

        for (int row = 0; row < size; row++) {
            String [] rowInput = scan.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);

            }

        }
        int mainDiagSum = 0;
        for (int counter = 0; counter < size; counter++) {
            mainDiagSum += matrix[counter][counter];
        }
        int secondDiagSum = 0;
        for (int row = 0; row < size  ; row++) {
            secondDiagSum += matrix[row][size - row -1];


        }

        int result = Math.abs(mainDiagSum-secondDiagSum);
        System.out.println(result);



    }
}

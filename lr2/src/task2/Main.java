package task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int xSize = 5 + rand.nextInt(5);
        int ySize = 5 + rand.nextInt(5);

        int[][] matrix = new int[xSize][ySize];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (i > 0 && i < xSize - 1) && (j > 0 && j < ySize - 1) ? 0 : 1;

        for (int[] row : matrix) {
            for (int num : row)
                System.out.print(num);
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Main {

    static byte num;
    private static Scanner input = new Scanner(System.in);

    static void magicSquare(int number) {
        int Matrix[][] = new int[number][number];
        int init = 1;
        int row = 0;
        int col = number / 2;

        int tempRow, tempCol;

        while (init <= number * number) {
            Matrix[row][col] = init;
            init++;
            tempRow = row;
            tempCol = col;

            row -= 1;
            col += 1;

            if (row == -1) {
                row = number - 1;
            }
            if (col == number) {
                col = 0;
            }
            if (Matrix[row][col] != 0) {
                row = tempRow + 1;
                col = tempCol;
                if (row == -1) {
                    row = number - 1;
                }
            }
        }

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an odd number to make Magic Square : ");
        num = input.nextByte();

        magicSquare(num);
    }
}
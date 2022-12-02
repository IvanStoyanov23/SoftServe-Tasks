import java.util.Arrays;

public class Loops_Task_8{

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 8},
                          {8, 4, 4},
                          {6, 9, 3}};

        int biggestNum = matrix[0][0];
        int biggestNumRow = 0;
        int biggestNumCol = 0;

        int currentRowIndex = biggestNumRow;

        int nextRowIndex = 0;
        int nextColIndex = 0;
        int nextNum = 0;

//      FIND BIGGEST NUMBER
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > biggestNum) {
                    biggestNum = matrix[row][col];
                    biggestNumRow = row;
                    biggestNumCol = col;
                }
            }
            currentRowIndex = biggestNumRow;
        }

//      PRINT THE MATRIX
        PrintMatrix(0, 0, matrix);
//      END FIND BIGGEST NUMBER

        while (biggestNum != matrix[0][0]) {

//          ROTATE THE COLUMNS
            if (biggestNumRow == 0){
                while (biggestNum != matrix[0][0]) {
                    int tempNum = 0;
                    int indexSwap = biggestNumCol;

                    for (int row = 0; row < matrix.length; row++) {
                        for (int col = 0; col < matrix[row].length; col++) {

                            if (col == indexSwap){
                                nextColIndex = col + 1;
                                if (nextColIndex > matrix[row].length - 1){
                                    nextColIndex = 0;
                                }

                                tempNum = matrix[row][col];
                                nextNum = matrix[row][nextColIndex];
                                matrix[row][col] = nextNum;
                                matrix[row][nextColIndex] = tempNum;

                                if (biggestNum == col){
                                    break;
                                }
                                indexSwap = col;
                                biggestNumCol = nextColIndex;
                                break;
                            }
                        }

                    }
////                PRINT THE MATRIX
                    PrintMatrix(0, 0, matrix);

                }
            }
//          END ROTATE THE COLUMNS

//          ROTATE ROWS
            else {
                if ((nextRowIndex >= matrix.length - 1 || nextRowIndex == 0)){

                    nextRowIndex = 0;
                }else {
                    nextRowIndex = currentRowIndex + 1;
                }

                var tempCurrentMatrixRow = matrix[currentRowIndex];
                var tempNextMatrixRow = matrix[nextRowIndex];
                var tempMatrixRow = tempCurrentMatrixRow;

                matrix[currentRowIndex] = tempNextMatrixRow;
                matrix[nextRowIndex] = tempMatrixRow;

                currentRowIndex++;
                if (currentRowIndex > matrix.length - 1) {
                    currentRowIndex = 0;
                }
                biggestNumRow = currentRowIndex;

//              PRINT THE MATRIX
                PrintMatrix(0, 0, matrix);
            }
//          END ROTATE THE ROWS
        }
    }

    public static void PrintMatrix(int r, int c, int[][]m){
        for (r = 0; r < m.length; r++) {
            for (c = 0; c < m[0].length; c++) {
                System.out.print(m[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
}

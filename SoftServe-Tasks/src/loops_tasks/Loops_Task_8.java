import java.util.Arrays;

public class Loops_Task_8{

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 8},
                {8, 4, 4},
                {6, 9, 3}};

        int biggestNum = matrix[0][0];
        int biggestNumRowIndex = 0;
        int biggestNumColIndex = 0;

        int currentRowIndex = biggestNumRowIndex;

        int prevRowIndex = 0;
        int prevColIndex = 0;
        int prevNum = 0;

//      FIND BIGGEST NUMBER
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > biggestNum) {
                    biggestNum = matrix[row][col];
                    biggestNumRowIndex = row;
                    biggestNumColIndex = col;
                }
            }
            currentRowIndex = biggestNumRowIndex;
        }

//      PRINT THE MATRIX
        PrintMatrix(0, 0, matrix);
//      END FIND BIGGEST NUMBER

        prevColIndex = biggestNumColIndex;
        prevRowIndex = biggestNumRowIndex;
        while (biggestNum != matrix[0][0]) {

//          ROTATE THE COLUMNS
            if (biggestNumRowIndex == 0){
                while (biggestNum != matrix[0][0]) {
                    int tempNum = 0;
                    int indexSwap = biggestNumColIndex;


                    for (int row = matrix.length - 1; row >= 0; row--) {
                        for (int col = matrix[row].length - 1; col >= 0; col--) {

                            if (col == indexSwap){
                                prevColIndex = col - 1;
                                if (prevColIndex < 0){
                                    prevColIndex = 0;
                                }

                                tempNum = matrix[row][col];
                                prevNum = matrix[row][prevColIndex];
                                matrix[row][col] = prevNum;
                                matrix[row][prevColIndex] = tempNum;

                                if (biggestNum == col){
                                    break;
                                }
                                indexSwap = col;
                                biggestNumColIndex = prevColIndex;
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
                if (prevRowIndex == 0){

                    prevRowIndex = 0;
                }else {
                    prevRowIndex = currentRowIndex - 1;
                }

                var tempCurrentMatrixRow = matrix[currentRowIndex];
                var tempPrevMatrixRow = matrix[prevRowIndex];
                var tempMatrixRow = tempCurrentMatrixRow;

                matrix[currentRowIndex] = tempPrevMatrixRow;
                matrix[prevRowIndex] = tempMatrixRow;

                currentRowIndex--;
                if (currentRowIndex == 0) {
                    currentRowIndex = 0;
                }
                biggestNumRowIndex = currentRowIndex;

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

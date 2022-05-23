package controller;
import model.Board;
public class Rules {
    public static int[] surroudingRows = {-1, -1, -1, 0, 1, 1, 1, 0};
    public static int[] surroudingColumns = {-1, 0, 1, 1, 1, 0, -1, -1};
    private static int aliveCounter = 0;
    public static void modify(Board board, int currentRow, int currentCol){
        for(int index = 0; index < 8; index++){
            int surroudingRow = surroudingRows[index] + currentRow;
            int surroudingColumn = surroudingColumns[index] + currentCol;
            if(board.grid[surroudingRow][surroudingColumn] == 1){
                aliveCounter++;
            } 
        }
    }
}

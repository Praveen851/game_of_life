package view;

import model.Board;

public class Display {
    public static void printGrid(Board board){
        for(int row = 0; row < board.R; row++){
            for(int col = 0; col < board.C; col++){
                if(board.grid[row][col] == 0)System.out.print(Colors.TEXT_WHITE + "#"+ Colors.TEXT_RESET);
                else System.out.print(Colors.TEXT_YELLOW + "#"+ Colors.TEXT_RESET);
            }
            System.out.println();
        }
    }
}

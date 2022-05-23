package controller;

import model.Board;

public class Play {
    public static void playGame(Board board){
        int counter = 0;
        while(counter < 50){
            for(int row = 0; row < board.R; row++){
                for(int col = 0; col < board.C; col++){
                    Rules.modify(board, row, col);
                }
            }
            counter++;
        }
    }   
}
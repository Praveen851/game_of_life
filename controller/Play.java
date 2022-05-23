package controller;

import javax.xml.transform.Templates;

import model.Board;
import java.util.ArrayList;
public class Play {
    static ArrayList<ArrayList<Integer>> tracker = new ArrayList<ArrayList<Integer>>();
    public static void playGame(Board board){
        int counter = 0;
        while(counter < 50){
            for(int row = 0; row < board.R; row++){
                for(int col = 0; col < board.C; col++){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    int aliveCount = Count.getCount(board, row, col);
                    if(board.grid[row][col] == 1 && aliveCount < 2){
                        temp.add(row);
                        temp.add(col);
                        tracker.add(temp);
                    }
                    else if(board.grid[row][col] == 1 && aliveCount > 3){
                        temp.add(row);
                        temp.add(col);
                        tracker.add(temp);
                    }
                    else if(board.grid[row][col] == 0 && aliveCount == 3){
                        temp.add(row);
                        temp.add(col);
                        tracker.add(temp);
                    }
                }
            }
            counter++;
            Rules.modify(board);
        }
    }   
}
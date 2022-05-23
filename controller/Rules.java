package controller;

import model.Board;
public class Rules {
    
    public static void modify(Board board){
        for(int index = 0; index < Play.tracker.size(); index++){
            board.grid[Play.tracker.get(index).get(0)][Play.tracker.get(index).get(1)] = board.grid[Play.tracker.get(index).get(0)][Play.tracker.get(index).get(1)] == 1? 0:1;
        }
    }
}
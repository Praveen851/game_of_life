package controller;

import model.Board;
public class Game{
    public static void main(String[] args) {   
        Board board = new Board();     
        Play.playGame(board);
    }
}
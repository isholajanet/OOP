package com.array.turtle;

public class SketchPad {
    private final int[][] board;

    public SketchPad(int numberOfColumn, int numberOfRow) {
       board = new int[numberOfRow][numberOfColumn];
    }

    public int[][] getBoard() {
        return board;
    }

}

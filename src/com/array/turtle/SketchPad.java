package com.array.turtle;

public class SketchPad {
    private final int[][] board;
    private final int numberOfColumn;
    private final int numberOfRow;

    public SketchPad(int numberOfColumn, int numberOfRow) {
        this.numberOfColumn = numberOfColumn; // Keep track of board column number
        this.numberOfRow = numberOfRow; // Keep track of board row number
       board = new int[this.numberOfRow][this.numberOfColumn]; // Instantiate object with instance variable in case any update
    }

    public int[][] getBoard() {
        return board;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }
}

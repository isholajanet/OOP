package com.array.turtle;

/**
 * @author whalewalker
 * This class show the row and column position on the sketchpad for easy tracking.
 */
public class SketchPadPosition {
    private int numberOfColumn;
    private int numberOfRow;

    //Initialize col and row variable for tracking the sketchpad position
    public SketchPadPosition(int numberRow, int numberOfColumn) {
        this.numberOfColumn = numberOfColumn;
        this.numberOfRow = numberRow;
    }


    // return col update position
    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    // set column position
    public void setNumberOfColumn(int numberOfColumn) {
        this.numberOfColumn = numberOfColumn;
    }

    // return col update position
    public int getNumberOfRow() {
        return numberOfRow;
    }

    // set row position
    public void setNumberOfRow(int numberOfRow) {
        this.numberOfRow = numberOfRow;
    }

    @Override
    /**
     * @return false if the object compared is not created from the same class and has the same number of row and column otherwise true
     */
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj.getClass() == this.getClass()){
            SketchPadPosition comparedObject = (SketchPadPosition) obj;
            boolean isSamePosition = comparedObject.numberOfColumn == this.getNumberOfColumn() && comparedObject.getNumberOfRow() == this.getNumberOfRow();

            if (isSamePosition) isEqual = true;
        }
        return isEqual;
    }
}

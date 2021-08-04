package com.array.turtle;

public class TurtlePosition {
    private SketchPad sketchPad;
    private int numberOfColumn;
    private int numberOfRow;

    public TurtlePosition(int numberRow, int numberOfColumn) {
        this.numberOfColumn = numberOfColumn;
        this.numberOfRow = numberRow;
        sketchPad = new SketchPad(this.numberOfRow, this.numberOfColumn);
    }

    public SketchPad getSketchPad() {
        return sketchPad;
    }

    public void setSketchPad(SketchPad sketchPad) {
        this.sketchPad = sketchPad;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public void setNumberOfColumn(int numberOfColumn) {
        this.numberOfColumn = numberOfColumn;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public void setNumberOfRow(int numberOfRow) {
        this.numberOfRow = numberOfRow;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isValid = false;
        if (obj.getClass() == this.getClass()){
            TurtlePosition compareObj = (TurtlePosition) obj;

            if (compareObj.getNumberOfColumn() == this.getNumberOfColumn() && compareObj.getNumberOfRow() == this.numberOfRow){
                isValid = true;
            }
        }
        return isValid;
    }
}

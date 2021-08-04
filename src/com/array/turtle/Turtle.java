package com.array.turtle;

import java.util.Arrays;

public class Turtle {

    private Pen pen;
    private Direction direction;
    private SketchPadPosition currentSketchPadPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.direction = Direction.EAST;
        currentSketchPadPosition = new SketchPadPosition(0,0);
    }

    public Pen getPen() {
        return pen;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public SketchPadPosition getCurrentSketchPadPosition() {
        return currentSketchPadPosition;
    }

    public void setCurrentSketchPadPosition(SketchPadPosition currentSketchPadPosition) {
        this.currentSketchPadPosition = currentSketchPadPosition;
    }

    public void turnRight() {
        switch (direction){
            case EAST -> setDirection(Direction.SOUTH);
            case WEST -> setDirection(Direction.NORTH);
            case SOUTH-> setDirection(Direction.WEST);
            case NORTH -> setDirection(Direction.EAST);
        }
    }

    public void turnLeft() {
        switch (direction){
            case EAST -> setDirection(Direction.NORTH);
            case WEST -> setDirection(Direction.SOUTH);
            case SOUTH-> setDirection(Direction.EAST);
            case NORTH -> setDirection(Direction.WEST);
        }
    }

    public void move(SketchPad sketchPad, int numberOfStep) {

        int[][] pad = sketchPad.getBoard();

        int currentColumnPosition = getCurrentSketchPadPosition().getNumberOfColumn();  // get initial col position
        int currentRowPosition = getCurrentSketchPadPosition().getNumberOfRow(); // get initial col position

        SketchPadPosition sketchPadPosition = getCurrentSketchPadPosition(); // get updated sketch pad pos (row, col)

        /**
         * @author whalewalker
         * @algorithm
         * check current pen position
         *   if pen is up
         *    check current direction
         *      if EAST
         *          check if the currentCol is greater than or equal to sketchpad number of col
         *           if true
         *            throw exception
         *             -- Because the number of 2d array has been exceeded
         *
         *           else
         *            set current sketchPadPosition = current column + step to move.
         */

        if (getPen().getPenPosition().equals(PenPosition.PEN_UP)){
            switch (direction){
                case EAST -> currentSketchPadPosition.setNumberOfColumn(currentColumnPosition + numberOfStep);
                case SOUTH -> currentSketchPadPosition.setNumberOfRow(currentRowPosition + numberOfStep);
                case NORTH -> currentSketchPadPosition.setNumberOfRow(currentRowPosition - numberOfStep);
                case WEST -> currentSketchPadPosition.setNumberOfColumn(currentColumnPosition - numberOfStep);

            }
        }


//        int columnPosition = currentSketchPadPosition.getNumberOfColumn();
//        int rowPosition = currentSketchPadPosition.getNumberOfRow();
//
//        switch(direction){
//            case EAST -> currentSketchPadPosition.setNumberOfColumn(columnPosition + numberOfStep);
//            case SOUTH -> currentSketchPadPosition.setNumberOfRow(rowPosition + numberOfStep);
//            case NORTH -> currentSketchPadPosition.setNumberOfRow(rowPosition - columnPosition);
//        }
    }

}

package com.array.turtle;

import java.util.Arrays;

public class Turtle {

    private Pen pen;
    private Direction direction;
    private TurtlePosition currentTurtlePosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.direction = Direction.EAST;
        currentTurtlePosition = new TurtlePosition(0,0);
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

    public TurtlePosition getCurrentTurtlePosition() {
        return currentTurtlePosition;
    }

    public void setCurrentTurtlePosition(TurtlePosition currentTurtlePosition) {
        this.currentTurtlePosition = currentTurtlePosition;
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
        int columnPosition = currentTurtlePosition.getNumberOfColumn();
        int rowPosition = currentTurtlePosition.getNumberOfRow();

        switch(direction){
            case EAST -> currentTurtlePosition.setNumberOfColumn(columnPosition + numberOfStep);
            case SOUTH -> currentTurtlePosition.setNumberOfRow(rowPosition + numberOfStep);
            case NORTH -> currentTurtlePosition.setNumberOfRow(rowPosition - columnPosition);
        }
    }

}

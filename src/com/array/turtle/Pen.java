package com.array.turtle;

public class Pen {
    private PenPosition penPosition;

    public Pen() {
        this.penPosition = PenPosition.PEN_UP;
    }

    public PenPosition getPenPosition() {
        return penPosition;
    }

    public void setPenPosition(PenPosition penPosition) {
        this.penPosition = penPosition;
    }
}

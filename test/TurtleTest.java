import com.array.turtle.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    Pen pen;
    Turtle turtle;
    SketchPad sketchPad;

    @BeforeEach
    void setup(){
        pen = new Pen();
        turtle = new Turtle(pen);
        sketchPad = new SketchPad(20, 20);
    }

    @AfterEach
    void tearDown() {
        pen = null;
        turtle=null;
    }

    @Test
    void turtleHasAPenTest(){
        Pen pen = turtle.getPen();
        assertNotNull(pen);
    }

    @Test
    void turtlePenIsUpByDefaultTest(){
        PenPosition penPosition = pen.getPenPosition();
        PenPosition expected = PenPosition.PEN_UP;
        assertEquals(expected, penPosition);
    }

    @Test
    void turtlePenPosition_canBeDownTest(){
        pen.setPenPosition(PenPosition.PEN_DOWN);
        PenPosition penPosition = pen.getPenPosition();
        PenPosition expected = PenPosition.PEN_DOWN;
        assertEquals(expected, penPosition);
    }

    @Test
    void turtlePenPosition_canBeUpTest(){
        pen.setPenPosition(PenPosition.PEN_DOWN);
        pen.setPenPosition(PenPosition.PEN_UP);
        PenPosition penPosition = pen.getPenPosition();
        PenPosition expected = PenPosition.PEN_UP;
        assertEquals(expected, penPosition);
    }

    @Test
    void turtle_canTurnRight(){
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.NORTH,turtle.getDirection());

        turtle.turnRight();
        assertEquals(Direction.EAST, turtle.getDirection());
    }

    @Test
    void turtle_canTurnLeft(){
        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.SOUTH,turtle.getDirection());

        turtle.turnLeft();
        assertEquals(Direction.EAST, turtle.getDirection());
    }

    @Test
    void turtle_canMove_EastWard_WhenPenIsUp(){
        int numberOfStep = 7;
        turtle.move(sketchPad, numberOfStep);
        assertEquals(new SketchPadPosition(0, 7), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtle_canMove_SouthWard_WhenPenIsUp(){
        int numberOfStep = 7;
        turtle.setDirection(Direction.SOUTH);
        turtle.move(sketchPad, numberOfStep);
        assertEquals(new SketchPadPosition(7, 0), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtle_canMove_NorthWard_WhenPenIsUp(){
        int numberOfStep = 7;
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(7, 0));
        turtle.setDirection(Direction.NORTH);

        turtle.move(sketchPad, numberOfStep);

        assertEquals(new SketchPadPosition(0, 0), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtle_canDraw_whileFacing_Eastward(){
        int numberOfStep = 7;
        turtle.getPen().setPenPosition(PenPosition.PEN_DOWN);
        turtle.move(sketchPad, numberOfStep);

        for (int column = 0; column < numberOfStep; column++){
            int expected = sketchPad.getBoard()[0][column];
            assertEquals(expected, 1);
        }
        assertEquals(new SketchPadPosition(0, 7), turtle.getCurrentSketchPadPosition());

        turtle.turnRight();
        turtle.move(sketchPad, numberOfStep);

        System.out.println(sketchPad.displaySketch());
        for (int row = 0; row < numberOfStep; row++){
            int expected = sketchPad.getBoard()[row][0];
            assertEquals(expected, 1);
        }


        assertEquals(new SketchPadPosition(7, 0), turtle.getCurrentSketchPadPosition());
    }

}

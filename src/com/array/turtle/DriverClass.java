package com.array.turtle;

import java.sql.Array;
import java.util.Arrays;

public class DriverClass {


    public static void main(String[] args) {
        SketchPad sketchPad = new SketchPad(10, 10);
        int numberOfStep = 30;
//        System.out.println("Number of column " + sketchPad.getNumberOfColumn());
//        System.out.println("Number of row " + sketchPad.getNumberOfRow());

        if(numberOfStep > sketchPad.getNumberOfColumn()){
            throw new IndexOutOfBoundsException("Bad request");
        }else {
            System.out.println("Go to class");
        }

//        System.out.println("Board " + Arrays.deepToString(sketchPad.getBoard()));

    }

}

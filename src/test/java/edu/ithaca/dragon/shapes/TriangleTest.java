package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest{

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(4,4);
        assertEquals(8, myTriangle.calcArea());

        myTriangle = new Triangle(8,3);
        assertEquals(12, myTriangle.calcArea());

        myTriangle = new Triangle(3,8);
        assertEquals(12, myTriangle.calcArea());

    }
}
package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(12, 8);
        assertEquals(96, myRectangle.calcArea());

        myRectangle = new Rectangle(16, 10);
        assertEquals(160, myRectangle.calcArea());

        myRectangle = new Rectangle(.012, 7);
        assertEquals(0.084, myRectangle.calcArea());
    }
}

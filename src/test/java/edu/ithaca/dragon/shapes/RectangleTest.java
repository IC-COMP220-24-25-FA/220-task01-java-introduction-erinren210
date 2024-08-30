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

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(12, 8);
        myRectangle.doubleSize();
        assertEquals(384, myRectangle.calcArea());

        myRectangle = new Rectangle(2, 2);
        myRectangle.doubleSize();
        assertEquals(16, myRectangle.calcArea());

        myRectangle = new Rectangle(.012, 7);
        myRectangle.doubleSize();
        assertEquals(0.336, myRectangle.calcArea());
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(12, 8);
        assertEquals(14.422, myRectangle.longestLineWithin(), 0.001);

        myRectangle = new Rectangle(2, 3);
        assertEquals(3.6056, myRectangle.longestLineWithin(), 0.0001);

        myRectangle = new Rectangle(.001, 2);
        assertEquals(2, myRectangle.longestLineWithin(), 0.1);
    }
}

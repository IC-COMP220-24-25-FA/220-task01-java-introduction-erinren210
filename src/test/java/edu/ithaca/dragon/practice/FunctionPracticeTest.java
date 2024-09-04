package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(4.2, FunctionPractice.calcSalePrice(10,60,5));
        assertEquals(0, FunctionPractice.calcSalePrice(20, 100, 10));
        assertEquals(15.75, FunctionPractice.calcSalePrice(15, 0, 5));
    }

    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(1, 1, false));
        assertTrue(FunctionPractice.isGoodDog(10, 20, true));
        assertTrue(FunctionPractice.isGoodDog(5, 0, true));

        assertFalse(FunctionPractice.isGoodDog(5, 0, false));
    }
    
}

package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        List<Rectangle> myList = ShapeMain.randomRectangleList();


    }

    public static List<Rectangle> randomRectangleList(){
        //returns a list of 5 randomly sized rectangles
        List<Rectangle> randomRectList = new ArrayList<>();

        Rectangle randRectangle = new Rectangle(Math.random(), Math.random());
        randomRectList.add(randRectangle);
        
        randRectangle = new Rectangle(Math.random(), Math.random());
        randomRectList.add(randRectangle);

        randRectangle = new Rectangle(Math.random(), Math.random());
        randomRectList.add(randRectangle);

        randRectangle = new Rectangle(Math.random(), Math.random());
        randomRectList.add(randRectangle);

        randRectangle = new Rectangle(Math.random(), Math.random());
        randomRectList.add(randRectangle);

        return randomRectList;
    }
}

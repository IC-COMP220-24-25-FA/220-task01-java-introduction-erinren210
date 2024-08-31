package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        List<Rectangle> myList = ShapeMain.randomRectangleList();
        printRectangleInfo(myList);


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

    public static void printRectangleInfo(List<Rectangle> listname){
        Rectangle rectA = listname.get(0);
        System.out.println(rectA.calcArea());
        System.out.println(rectA.longestLineWithin());

        Rectangle rectB = listname.get(1);
        System.out.println(rectB.calcArea());
        System.out.println(rectB.longestLineWithin());

        Rectangle rectC = listname.get(2);
        System.out.println(rectC.calcArea());
        System.out.println(rectC.longestLineWithin());

        Rectangle rectD = listname.get(3);
        System.out.println(rectD.calcArea());
        System.out.println(rectD.longestLineWithin());

        Rectangle rectE = listname.get(4);
        System.out.println(rectE.calcArea());
        System.out.println(rectE.longestLineWithin());
    }
}

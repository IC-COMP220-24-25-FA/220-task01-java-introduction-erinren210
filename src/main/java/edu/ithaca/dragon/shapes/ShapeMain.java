package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.random.*;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        List<Shape> aList = ShapeMain.randomShapeList();
        ShapeMain.randomShapeListPrinter(aList);
        //List<Rectangle> myList = ShapeMain.randomRectangleList();
        //printRectangleInfo(myList);
        //int loopInt = 0;
        //while(loopInt < 5){
            //int idx = userIndex(args);
            //*doubleSizeOfOne(myList, idx);
            //printRectangleInfo(myList);
            //loopInt++;
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

    public static void doubleSizeOfOne(List<Rectangle> listname, int idx){
        Rectangle currentRect = listname.get(idx);
        currentRect.doubleSize();
    }

    public static int userIndex(String[] args){
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Value 0-4");
            int idx = myObj.nextInt();
            return idx;
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    public static List<Shape> randomShapeList(){
        List<Shape> randomShapeList = new ArrayList<>();
        int listCounter = 0;
        while(listCounter < 11){
            double myRand = Math.random();
            if(myRand < 0.3){
                randomShapeList.add(ShapeMain.rectRandomizer());
            }
            else{
                if(myRand > 0.6){
                    randomShapeList.add(ShapeMain.circRandomizer());
                }
                else{
                    randomShapeList.add(ShapeMain.triRandomizer());
                }
            }
            listCounter ++;
        }
            return randomShapeList;
        };
    

    public static Shape rectRandomizer(){
        Rectangle myRect = new Rectangle(Math.random(), Math.random());
        return myRect;
    }

    public static Shape circRandomizer(){
        Circle myCircle = new Circle(Math.random());
        return myCircle;
    }

    public static Shape triRandomizer(){
        Triangle myTriangle = new Triangle(Math.random(), Math.random());
        return myTriangle;
    }

    public static void randomShapeListPrinter(List<Shape> myList){
        List<String> printList = new ArrayList<>();
        int idx = 0;
        while(idx < 11){
            printList.add(myList.get(idx).toString());
            idx ++;
        }
        System.out.println(printList);
    }
}

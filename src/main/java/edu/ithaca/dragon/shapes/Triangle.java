package edu.ithaca.dragon.shapes;

public class Triangle{
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
    }

    public double calcArea(){
        return (base * height)/2;
    }

    public void doubleSize(){
        base = base * 2;
        height = height * 2;
    }

    public double longestLineWithin(){
        return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
    }

    public String toString(){
        String myTriangle = new String("triangle ");
        return myTriangle + base + height;
    }
}
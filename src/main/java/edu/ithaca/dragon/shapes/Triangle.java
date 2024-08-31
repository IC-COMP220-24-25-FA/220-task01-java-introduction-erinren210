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
}
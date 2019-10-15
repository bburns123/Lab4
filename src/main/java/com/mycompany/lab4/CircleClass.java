/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

/**
 *
 * @author Brendyn Burns
 */
public class CircleClass {
    private double radius;
    private final double pi = 3.14159;
    
    public CircleClass(double inRadius) {
        this.radius = inRadius;
    }
    
    public CircleClass() {
        radius = 0.0;
    }
    
    //getter and setters for radius

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // area, diameter, and circumference methods
    
    public double area() {
        double area = pi * radius * radius;
        return area;
    }
    
    public double diameter() {
        double diameter = radius * 2;
        return diameter;
    }
    
    public double circumference() {
        double circumference = 2 * pi * radius;
        return circumference;
    }
    
    
}

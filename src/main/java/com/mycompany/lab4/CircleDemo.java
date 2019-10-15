/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author Brendyn Burns
 */
public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius of a circle to determine the area, diameter, and circumference of the circle: ");
        double radius = scanner.nextDouble();
        
        CircleClass circle1 = new CircleClass(radius);
        double area = circle1.area();
        double diameter = circle1.diameter();
        double circumference = circle1.circumference();
        
        
        System.out.println("The radius is: " + radius);
        System.out.println("The area is: " + area);
        System.out.println("The diameter is: " + diameter);
        System.out.println("The circumference is: " + circumference);
        
    }
}

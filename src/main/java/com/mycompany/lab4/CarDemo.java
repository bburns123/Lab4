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
public class CarDemo {
    public static void main(String[] args) {
        CarClass car1 = new CarClass(1993, "Ford");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 'Enter' to accelerate 5 times!");
        scanner.nextLine();
        
        for(int counter = 1; counter <=5; counter++) {
            car1.accelerate();
            System.out.println("Current speed: " + car1.getSpeed());
            scanner.nextLine();
        }
        
        System.out.println("Press 'Enter' to break 5 times!");
        scanner.nextLine();
        
        for(int counter = 1; counter <=5; counter++) {
            car1.brake();
            System.out.println("Current speed: " + car1.getSpeed());
            scanner.nextLine();
        }
    }
}

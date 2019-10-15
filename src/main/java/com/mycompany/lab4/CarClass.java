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
public class CarClass {
    private int yearModel;
    private String make;
    private int speed;
    
    
    public CarClass(int inYearModel, String inMake) {
        this.yearModel = inYearModel;
        this.make = inMake;
        this.speed = 0;
                
    }
    
    public int accelerate() {
        this.speed = speed + 5;
        return speed;
    }
    
    public int brake() {
        this.speed = speed - 5;
        return speed;
    }

    //Getter and Setter Methods
    
    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
}

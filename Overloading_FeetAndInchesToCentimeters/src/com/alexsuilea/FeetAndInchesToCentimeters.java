package com.alexsuilea;

public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet < 0 || inches < 0 || inches > 12){
            return -1;
        }

        return (feet / 0.032808) + (inches / 0.39370);
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int)inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

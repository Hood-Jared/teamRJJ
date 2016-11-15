/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

/**
 *
 * @author ryahh, jared, justin
 */
public class DangerController {

    //Calculate the circumference of a circle
    public double calcLightningSand(double diameter) {
        if (diameter <= 0 || diameter > 10) {
            return -1;
        }
        double circumference = diameter * Math.PI / 2;
        return circumference;
    }
    
    //Calculate the area of a triangle A=h*b/2
    public double calcFireSpouts(int height, int base){
        if (height <= 0 || base <= 0) {
            return -1;
        }
        double triangleArea = height * base / 2;
        return triangleArea;
    }
    
    /*
    * Rodent Danger Controller
    * System will show a pattern of numbers, 
    * player must return the next number in the series.
    */
              
    public int calcRous(int firstNumber) {
        int answerRous = firstNumber * 2; 
        if (firstNumber != answerRous) {
        return -1;
    } 
        
        return answerRous;
  }

}  
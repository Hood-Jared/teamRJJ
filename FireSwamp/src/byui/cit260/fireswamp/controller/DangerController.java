/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import byui.cit260.fireswamp.exceptions.DangerControllerException;

/**
 *
 * @author ryahh, jared, justin
 */
public class DangerController {

    //Calculate the circumference of a circle
    public double calcLightningSand(double diameter) throws DangerControllerException {
        double circumference = diameter * Math.PI / 2;

            if (diameter <= 0 || diameter > 10) {
                throw new DangerControllerException("You miscalculated and ended up sinking into the Lightning Sand. "
                        + "Better luck next time!");
            }
        return circumference;
}
    
    //Calculate the area of a triangle A=h*b/2
    public double calcFireSpouts(int height, int base) throws DangerControllerException {
        if (height <= 0 || base <= 0) {
            throw new DangerControllerException("You cannot have a negative height or base. Try again!");
        }
        double triangleArea = height * base / 2;
        return triangleArea;
    }
    
    /*
    * Rodent Danger Controller
    * System will show a pattern of numbers, 
    * player must return the next number in the series.
    */
              
    public int calcRous(int firstNumber) throws DangerControllerException {
        int answerRous = firstNumber * 2; 
        if (firstNumber != answerRous) {
            throw new DangerControllerException("You did not calculate correctly. Better Luck next time!");
    } 
        
        else return answerRous;
  }

}  
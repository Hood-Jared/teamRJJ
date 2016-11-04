/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

/**
 *
 * @author ryahh
 */
public class DangerController {

    public double calcLightingSand(double diameter) {
        if (diameter <= 0 || diameter > 10) {
            return -1;
        }
        double answer = diameter * Math.PI / 2;
        return answer;
    }
    
    //Calculate the area of a triangle A=h*b/2
    public double CalcFireSpouts(double triangleArea){
        if (triangleArea <= 0) {
            return -1;
        }
        double answer = 10 * 20 / 2;
        return answer;
    }
    
    /*
    * Rodent Danger Controller
    * System will show a pattern of numbers, 
    * player must return the next number in the series.
    */
              
        public double calcRous(double nextNumber,double lastNumber){
        if (nextNumber <= 0) {
            return -1;
        } 
        double answerRous;
        answerRous = (lastNumber * 2);
        return answerRous;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import byui.cit260.fireswamp.controller.DangerController;
import byui.cit260.fireswamp.exceptions.DangerControllerException;
import java.io.IOException;
import java.util.Random;
//import java.util.Scanner;

/**
 *
 * @author blvd
 */
public class FireSpoutsView extends View {
    
    //Randomly generate value or grab it from player's current location
    Random r = new Random();
    private int height = r.nextInt(5) + 5;
    private int base = r.nextInt(5) + 5;
    
    @Override
    public void display() {
        
        //Display problem to user
        console.println("\nYou've encountered a fire spout!"
                + "\n"
                + "\nTo get past the Fire Spout you must jump over it."
                + "\nYou notice that the fire is " + height + " ft tall."
                + "\nYou can only stand to get " + base + " ft from the base"
                + "\nany closer and it will burn you. "
                + "\n"
                + "\nCalculate the area you have to cover when you jump"
                + "\nover the Fire Spout. If you miscalculate it you will"
                + "\ndie!"
                + "\n"
                + "\nThe formula to use is area = height * base / 2");
               
        
        //collect input
        String input = getInput();
        
        
        try {
            //validate input
            boolean isCorrect = doAction(input);
        
            //present user with results
            if(isCorrect) {
                console.println("You made it over the Fire Spout!");                
            }
            else throw new DangerControllerException("You didn't jump high enough! "
                    + "The Fire Spout caught you in midair and you burned!");
        } catch (DangerControllerException dce) {
            console.println(dce.getMessage());
        }
                      
    }
      
    @Override
    public boolean doAction(String value) throws DangerControllerException {
        
        double input = Integer.parseInt(value);
        
        DangerController dc = new DangerController();
        
        double actualAnswer = dc.calcFireSpouts(height, base);
                   
        return actualAnswer == input;
          
    }
}

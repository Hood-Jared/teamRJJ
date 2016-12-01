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
/**
 *
 * @author jared
 */
public class RousView extends View {
    
   
    Random r = new Random();
    private int firstNumber = 5;
    
    @Override
    public void display() {
        
        console.println("\nYou've encountered a group of Rabid ROUS!"
                + "\n"
                + "\nTo get past the First ROUS you must know the sequence they."
                + "\nwill attack. " + firstNumber + " is your first clue."
                + "\nThe next number is  " + (firstNumber * 2) + "."
                + "\nYour final clue is " + (firstNumber - firstNumber) + "."
                + "\n"
                + "\nIf you can figure out the sequence you can continue."
                + "\nIf not you will be consumed, piece by piece.");
                
          
        //collect input
        String input = getInput();
        try {
            //validate input
            boolean isCorrect = doAction(input);

            //present user with results
            if(isCorrect) {
                console.println("You outsmarted the Rodents!");
            } else {
                console.println("You need to rethink your answer, hopefully you have enough limbs left.");
            }
        } catch (DangerControllerException dce) {
            ErrorView.display("display()/RousView", dce.getMessage());
        }
                      
    }
      
    @Override
    public boolean doAction(String value) throws DangerControllerException{
        
        double input = Integer.parseInt(value);
        
        DangerController dc = new DangerController();
        
        int actualAnswer = dc.calcRous(firstNumber);
                   
        return actualAnswer == input;
          
    }
}

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
 * @author ryahh
 */
public class LightningSandView extends View {
    
    private double diameter;
    
    @Override
    public void display() {
         
        //Randomly generate value or grab it from player's current location
        Random r = new Random();
        diameter = r.nextInt(5) + 5;
        
        //Display problem to user
        console.println("You've encountered lightning sand."
                + "\nYou are standing at the edge."
                + "... the diameter is " + diameter +" ft."
                + "How far must you walk to walk along the edge to the other side");
               
        
        //collect input
        String input = getInput();
          
        //validate input
        try {
            boolean isCorrect= doAction(input);
            
            if(isCorrect) {
            console.println("You made it across");
            } else {
                System.err.println("You fell in");
                MainMenuView mmv = new MainMenuView();
                mmv.display();
            }
        } catch (Exception e) {
            console.println("You entered an invalid input, try again...");
            this.display();
        }
                 
        //present user with results
        
                      
    }
    @Override
    public String getInput(){   
        boolean valid = false;
        String selection = null;
        
        // while a valid name has not been retrieved
        while (!valid){
            
            try {
                selection = keyboard.readLine();
                selection = selection.trim().toUpperCase();                
            } catch (IOException ex) {
                ErrorView.display("LightningSandView", ex.getMessage());
            }

            if (selection.length() < 1) {
                console.println("Invalid value: You must enter a number.");
                continue;
            }
            
            break;
        }
        
        return selection;
    }
    
    @Override
    public boolean doAction(String value) throws DangerControllerException{
        
        double input = Double.parseDouble(value);
        
        DangerController dc = new DangerController();
        
        double actualAnswer = dc.calcLightningSand(diameter);
                   
        return (int)actualAnswer == (int)input;
          
    }
}

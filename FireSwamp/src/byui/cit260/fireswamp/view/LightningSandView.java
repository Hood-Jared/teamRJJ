/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import byui.cit260.fireswamp.controller.DangerController;
import java.util.Random;
import java.util.Scanner;

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
        System.out.println("You've encountered lightning sand."
                + "\nYou are standing at the edge."
                + "... the diameter is " + diameter +" ft."
                + "How far must you walk to walk along the edge to the other side");
               
        
        //collect input
        String input = getInput();
          
        //validate input
        boolean isCorrect= doAction(input);
                 
        //present user with results
        if(isCorrect) {
            System.out.println("You made it across");
        } else {
            System.err.println("You fell in");
        }
                      
    }
    @Override
    public String getInput(){      
        Scanner in = new Scanner(System.in);
        String input = " ";
        boolean validInput = false;
        
        while (!validInput){
            
            input = in.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            
            try{
                Double.parseDouble(input);
                validInput = true;
            }catch (Exception e){
                System.out.println("\nInvalid value: You must enter a number.");
            }
        }
        
        return input;
    }
        
    public boolean doAction(String value){
        
        double input = Double.parseDouble(value);
        
        DangerController dc = new DangerController();
        
        double actualAnswer = dc.calcLightningSand(diameter);
                   
        return (int)actualAnswer == (int)input;
          
    }
}

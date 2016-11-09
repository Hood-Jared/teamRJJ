/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import java.util.Scanner;

/**
 *
 * @author ryahh
 */
public abstract class View implements InterfaceView{
    
    protected String displayMessage;
    
    public View(){
        
    }
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
       
        boolean done = false;
        
        do {
            System.out.println("\n" + this.displayMessage);
            
            String value = this.getInput();
            
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        Scanner in = new Scanner(System.in);
        String input = " ";
        boolean validInput = false;
        
        while (!validInput){
            
            input = in.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if (input.length() < 1 ){
                System.out.println("\nInvalid value: You must enter a character.");
            } else{
                validInput = true;
            }
        }
        
        return input;
    }
      
    public 
}

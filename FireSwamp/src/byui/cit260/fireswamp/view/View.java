/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import byui.cit260.fireswamp.exceptions.DangerControllerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ryahh
 */
public abstract class View implements InterfaceView {
    
    protected String displayMessage;
    protected final BufferedReader keyboard = FireSwamp.FireSwamp.getInFile();
    protected final PrintWriter console = FireSwamp.FireSwamp.getOutFile();
    
    public View(){
        
    }
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
       
        boolean done = false;
        
        do {
            console.println("\n" + this.displayMessage);
            
            String value = this.getInput();
                                    
            try {
                done = this.doAction(value);
            } catch (DangerControllerException ex) {
                ErrorView.display("display/View", ex.getMessage());
            }
        } while (!done);
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        
        // while a valid name has not been retrieved
        while (!valid){
            
            try {
                selection = keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display("getInput/View", "Invalid selection, Try again");
            }
            selection = selection.trim().toUpperCase();
            
            if (selection.length() < 1 ){ // blank value entered
                console.println("\n*** Invalid selection *** Try again");
            } else{
                valid = true;
            }
        }
        
        return selection;
    }
}

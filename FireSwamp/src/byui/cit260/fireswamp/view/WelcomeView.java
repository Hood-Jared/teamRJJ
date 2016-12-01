/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import byui.cit260.fireswamp.exceptions.DangerControllerException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ryahh & jared
 */
public class WelcomeView extends View {

    public WelcomeView() {
        
        
        console.println("\n*         WELCOME TO THE FIRESWAMP         *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                +"\n*                                          *"
                +"\n*          Enter at your own risk!         *"
                +"\n*     The Fire Swamp is full of Dangers    *"
                +"\n*       You must navigate this Dangers     *"
                +"\n*    To survive and get to the other side  *"
                +"\n*          Watch out for the RoUs!         *"
                +"\n*          Rodents of Unsual Size!         *"
                +"\n*     Listen Carefully to the Fire Spurts  *"
                +"\n*                    and                   *"
                +"\n*             The Lightining Sand          *"
                +"\n*        If you can survive you can        *"
                +"\n*     Build your dream home in the swamp.  *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
        
    }
    
    private void displayBanner(){

    }
    
    public void displayStartProgramView() throws DangerControllerException, IOException{
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        displayWelcome(playerName);
        
        MainMenuView mmv = new MainMenuView();
        mmv.display();
    }
    
    private String getPlayerName() throws IOException{
        
        boolean isValidName = false;
        String name = "";
        
        console.println("Please enter your name: ");
        
        while(!isValidName){
            String input = "";
            input = keyboard.readLine();
            
            if (input != null && input.length() >= 2){
                isValidName = true;
                name = input;
                
            } else {
                console.println("Input is invalid - name must be at least 2 characters");
            }         
        }
        return name;
    }   
    
    private void displayWelcome(String playerName){
        console.println("============================");
        console.println("Welcome " + playerName + ".");
        console.println("Enjoy the game!");
        console.println("============================");
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }
}

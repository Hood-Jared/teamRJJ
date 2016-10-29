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
public class WelcomeView {
    
    private void displayBanner(){
        
        System.out.println("**************" 
                +  "Welcome to the Fire Sawmp Game" 
                +  "*****************");
        
    }
    
    public void displayStartProgramView(){
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        displayWelcome(playerName);
    }
    
    private String getPlayerName(){
        
        Scanner in = new Scanner(System.in);
        boolean isValidName = false;
        String name = "";
        
        System.out.println("Please enter your name: ");
        
        while(!isValidName){
            String input = "";
            input = in.nextLine();
            
            if (input != null && input.length() >= 2){
                isValidName = true;
                name = input;
                
            } else {
                System.out.println("Inout is invalid - name must be at least 2 characters");
            }         
        }
        return name;
    }   
    
    private void displayWelcome(String playerName){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

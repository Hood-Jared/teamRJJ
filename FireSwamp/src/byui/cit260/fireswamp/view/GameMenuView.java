/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import byui.cit260.fireswamp.controller.MapController;

/**
 *
 * @author blvd
 */
public abstract class GameMenuView extends View {
    
    public GameMenuView() {
        super("\nGame Menu"
            + "\nW - Move North"
            + "\nS - Move South"
            + "\nA - Move West"
            + "\nD - Move East"
            + "\nI - Check Inventory"
            + "\nH - Help Menu"
            + "\nG - Save Game"
            + "\nQ - Quit to main menu");
    }

    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'W':
                moveNorth();
                break;
            case 'S':
                moveSouth();
                break;
            case 'A':
                moveWest();
                break;
            case 'D':
                moveEast();
                break;
            case 'I':
                showInventory();
                break;
            case 'H':
                HelpMenuView hmv = new HelpMenuView();
                hmv.display();
                break;
            case 'G':
                saveGame();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }
    
    
}

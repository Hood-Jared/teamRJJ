/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import FireSwamp.FireSwamp;
import byui.cit260.fireswamp.controller.GameControl;

/**
 *
 * @author ryahh
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\nMAIN MENU"
            + "\nN - Start New Game"
            + "\nS - Save Game"
            + "\nL - Start Saved Game"
            + "\nH - Help Menu"
            + "\nQ - Quit"
            + "\n");
    }


    @Override
    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'N':
                this.startNewGame();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'L':
                this.startSavedGame();
                break;
            case 'H':
                this.helpMenu();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl gc = new GameControl();
            gc.createNewGame(FireSwamp.getPlayer());
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } catch (Exception e) {
            ErrorView.display("startNewGame/MainMenuView", e.getMessage());
        }
    }
    
    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the game"
                + " is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(FireSwamp.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("saveGame/MainMenuView", ex.getMessage());
        }
    }

    private void startSavedGame() {
        
        this.console.println("\n\nEnter the file path for the file where the game"
                + " was saved.");
        
        String filePath = this.getInput();

        try {
            // start a saved game
            GameControl.getSavedGame(filePath);    
        } catch (Exception e) {
            ErrorView.display("startSavedGame/MainMenuView", e.getMessage());
        }

        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void helpMenu() {
        console.println("HELP MENU CALLED");
        HelpMenuView display = new HelpMenuView();
        display.display();
    }
}

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
            + "\nL - Load Saved Game"
            + "\nH - Help Menu"
            + "\nQ - Quit"
            + "\n");
    }


    @Override
    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl gc = new GameControl();
        gc.createNewGame(FireSwamp.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        System.out.println("LOAD GAME CALLED");
    }

    private void helpMenu() {
        System.out.println("HELP MENU CALLED");
        HelpMenuView display = new HelpMenuView();
        display.display();
    }
}

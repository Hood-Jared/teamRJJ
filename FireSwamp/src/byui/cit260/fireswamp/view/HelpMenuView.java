/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import java.util.Scanner;

/**
 *
 * @author justin
 */
public class HelpMenuView {

    private final String menu = 
            "\n****Help Menu****"
            + "\n I - Inventory"
            + "\n C - Clues"
            + "\n D - Dangers"
            + "\n M - Movement"
            + "\n B - Back to Main Menu";
    
    public void display() {

        boolean done = false;
        do {
            System.out.println("\n" + this.menu);

            String value = this.getInput();

            done = this.doAction(value);
        } while (!done);

    }

    public String getInput() {
        Scanner in = new Scanner(System.in);
        String input = " ";

        boolean validInput = false;

        while (!validInput) {
            input = in.nextLine();
            input = input.trim();
            input = input.toUpperCase();

            if (input.length() < 1) {
                System.out.println("\nInvalid value: You must enter a character.");
            } else {
                validInput = true;
            }
        }
        return input;
    }
    
    
    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'I':
                helpInventory();
                break;
            case 'C':
                helpClues();
                break;
            case 'D':
                helpDangers();
                break;
            case 'M':
                helpMovement();
            case 'B':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }
    
    private void helpInventory() {
        System.out.println("\nWelcome to the Inventory Help Screen"
              + "\n"
              + "\nYour inventory is necessary to help you survive"
              + "\nthe dangers of the Fire Swamp! Should you run"
              + "\ninto Fire Spouts or ROUS's or Lightning Sand"
              + "\nyou will need either to have a rope, bucket of"
              + "\nwater, or to correctly perform a calculation"
              + "\nin order to survive. If you are out of any of"
              + "\nthese items or you perform the calculation"
              + "\nincorrectly you will die and the game will be"
              + "\nover. Good luck!");
    }
    
    private void helpClues() {
        System.out.println("\n\nAt times there may be clues to help you."
                + "\n"
                + "\nThese clues are priimarily contained within the"
                + "\nmap view. You can only see the dangers that are"
                + "\nnext to you. When you are next to a danger on the"
                + "\nmap it will be shown by a D. This will tell you"
                + "\nthat if you move onto that spot of the map you will"
                + "\nrisk dying from the danger. Good Luck!");
    }
    
    private void helpDangers() {
        System.out.println("\nThere are three dangers you should be aware of"
                + "\n"
                + "\nROUS's: These are Rats of Unusual Size. They are"
                + "\nmassive rats about the size of a dog. In order to get"
                + "\naway from them you will need to be quick on your feet");
    }
    
    private void helpMovement() {
        System.out.println("\nTo move on the map you will use particular keys"
                + "\n"
                + "\nThese keys will move you north, south, east, or west."
                + "\nBe careful which way you move because if you run into"
                + "\na danger it may result in your death!");
    }

    void displayHelpMenuView() {
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayHelpMenuView();
    }
    
}
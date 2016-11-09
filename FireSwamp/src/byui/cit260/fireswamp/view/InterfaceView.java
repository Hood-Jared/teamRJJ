/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

//import java.util.Scanner;

/**
 *
 * @author ryahh
 */
public class InterfaceView {
    
    public void display() {

        boolean done = false;
        do {
            System.out.println("\n" + this.menu);

            String value = this.getInput();

            done = this.doAction(value);
        } while (!done);

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
}

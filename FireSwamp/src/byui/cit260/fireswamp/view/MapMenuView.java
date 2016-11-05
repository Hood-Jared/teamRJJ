/*
 * @author jared
 */

package byui.cit260.fireswamp.view;
import java.util.Scanner;


public class MapMenuView {
    
    
    private final String menu = "\nMap Menu"
            + "\nO - Open Map"
            + "\nL - Return to Game"
            + "\nQ - Quit"
            + "\n";

    public MapMenuView() {

    }

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
            case 'O':
                openMap();
                break;
            case 'R':
                returnGame();
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